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

        private fun pipsToCards(pips: List<String>): List<Card> =
                pips.map { pip -> Card.fromString(pip)}
    }

    override fun toString(): String {
        return "$list"
    }
}
