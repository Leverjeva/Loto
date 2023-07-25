

fun main() {
    println ("Введите количество игроков")
    val numberOfPlayers = readLine()?.toIntOrNull() ?: return
    println ("Введите количество карточек у игроков")
    val numberOfCards = readLine()?.toIntOrNull() ?: return

    Game(numberOfPlayers, numberOfCards).iteration()
}



