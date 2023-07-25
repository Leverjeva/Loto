class Player(numberOfCards: Int) {

    val cards = List(numberOfCards) { Card().createCard() }
    var victory: Boolean = false

    fun checkNumber(barrel: Int) {
        cards.forEach { card ->
            card.forEach { row ->
                row.forEachIndexed { index, value ->
                    if (value ==barrel){
                        println("Совпало число $barrel")
                        row[index]=0
                    }
                }
            if (row.sum() ==0) victory = true
            }

        }
    }

}