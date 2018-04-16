package com.pokerplayer.model

data class Hand(
    private val first: Card,
    private val second: Card,
    private val third: Card,
    private val fourth: Card,
    private val fifth: Card
) {
    val list: List<Card>
        get() = listOf(first, second, third, fourth, fifth)

    companion object {
        fun fromString(stringRep: String): Hand {
            val split = stringRep.split(' ').filterNot { it == "" }.distinct()
            if (split.size != 5) throw IllegalArgumentException("$split should have 5 items")
            val cards = pipsToCards(split)
            return Hand(cards[0], cards[1], cards[2], cards[3], cards[4])
        }

        private fun pipsToCards(pips: List<String>): List<Card> {
            val cards = mutableListOf<Card>()
            for (pip in pips) {
                cards.add(Card.fromString(pip))
            }
            return cards
        }
    }

    override fun toString(): String {
        return "$list"
    }
}
