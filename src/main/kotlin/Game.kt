import kotlinx.coroutines.*

class Game(numberOfPlayers: Int, private val numberOfCards: Int) {
    private val players = List(numberOfPlayers) { Player(numberOfCards) }
    private val jobs = mutableListOf<Job>()

    fun iteration() {
        println("Игра начинается")
        for (i in players.indices) {
            println("Игрок ${i+1}")
            for (j in players[i].cards.indices) {
                for (k in players[i].cards[j].indices)
                    println(players[i].cards[j][k].contentToString())
            }
        }

        Host.takeBarrel()
        runBlocking {
            players.forEach { _ ->
                val job =   launch {
                    Host.takeBarrel().collect { it ->
                        for (i in players.indices) {
                            yield()
                            players[i].checkNumber(it)
                            if (players[i].victory) {
                                println("Победил игрок ${i+1}")
                                cancel()
                                jobs.forEach{
                                    it.cancel()
                                }
                                break
                            }
                        }
                    }

                }
                jobs.add(job)
            }

        }

    }
}