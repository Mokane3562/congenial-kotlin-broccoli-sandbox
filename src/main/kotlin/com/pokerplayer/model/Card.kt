package com.pokerplayer.model

import java.util.*

data class Card(val rank: Rank, val suit: Suit) {

    companion object Cards {
        val allCards: Set<Card>
            get() {
                val set =  HashSet<Card>()
                for (rank in Rank.values()) {
                    for (suit in Suit.values()) {
                        set.add(Card(rank, suit))
                    }
                }
                return set
            }
    }

    val isBroadway: Boolean
        get() = this.rank.ordinal >= 8

    val isFace: Boolean
        get() = this.rank == Rank.JACK || this.rank == Rank.QUEEN || this.rank == Rank.KING

    fun getDistance(otherCard: Card): Int {
        if (this.rank == otherCard.rank) {
            return 0
        } else if (this.rank == Rank.ACE || otherCard.rank == Rank.ACE) {
            val distanceFromAce = this.rank.compareTo(otherCard.rank)
            if (distanceFromAce > 6) { //rank1 is low ace
                return otherCard.rank.compareTo(Rank.TWO) + 1
            } else if (distanceFromAce < -6) { //rank2 is low ace
                return this.rank.compareTo(Rank.TWO) + 1
            }
        }
        return Math.abs(this.rank.compareTo(otherCard.rank))
    }
}