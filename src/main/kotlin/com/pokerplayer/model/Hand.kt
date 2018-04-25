package com.pokerplayer.model

data class Hand(val cards: Array<Card>)
{
    val list: List<Card>
        get() = cards.asList()

    companion object {
        fun fromString(stringRep: String): Hand {
            val split = stringRep.split(' ').filterNot { it == "" }.distinct()
            if (split.size != 5) throw IllegalArgumentException("$split should have 5 items")
            val tempCards = pipsToCards(split)
            return Hand(tempCards.toTypedArray())
        }

        private fun pipsToCards(pips: List<String>): List<Card> {
            val cards = mutableListOf<Card>()
            for (pip in pips) {
                cards.add(Card(pip))
            }
            return cards
        }
    }

    override fun toString(): String {
        return "$list"
    }
}
