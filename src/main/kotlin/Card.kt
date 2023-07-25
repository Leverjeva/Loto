class Card {

    fun createCard(): Array<Array<Int>> {
        val card: Array<Array<Int>> = Array(3) { arrayOf(0, 0, 0, 0, 1, 1, 1, 1, 1) }
        card[0].shuffle()
        card[1].shuffle()
        card[2].shuffle()

        val range = (1..9).toMutableList()
        val range1 = (10..19).toMutableList()
        val range2 = (20..29).toMutableList()
        val range3 = (30..39).toMutableList()
        val range4 = (40..49).toMutableList()
        val range5 = (50..59).toMutableList()
        val range6 = (60..69).toMutableList()
        val range7 = (70..79).toMutableList()
        val range8 = (80..90).toMutableList()

        for (i in card.indices) {

            if (card[i][0] == 1) card[i][0] = range.shuffled().first()
            range.remove(card[i][0])
            if (card[i][1] == 1) card[i][1] = range1.shuffled().first()
            range1.remove(card[i][1])
            if (card[i][2] == 1) card[i][2] = range2.shuffled().first()
            range2.remove(card[i][2])
            if (card[i][3] == 1) card[i][3] = range3.shuffled().first()
            range2.remove(card[i][3])
            if (card[i][4] == 1) card[i][4] = range4.shuffled().first()
            range4.remove(card[i][4])
            if (card[i][5] == 1) card[i][5] = range5.shuffled().first()
            range2.remove(card[i][5])
            if (card[i][6] == 1) card[i][6] = range6.shuffled().first()
            range6.remove(card[i][6])
            if (card[i][7] == 1) card[i][7] = range7.shuffled().first()
            range7.remove(card[i][7])
            if (card[i][8] == 1) card[i][8] = range8.shuffled().first()
            range8.remove(card[i][8])
        }
        return card
    }

}