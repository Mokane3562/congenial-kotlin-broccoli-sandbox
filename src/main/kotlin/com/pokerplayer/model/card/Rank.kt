package com.pokerplayer.model.card

enum class Rank constructor(val id: Char, val displayName: String) {
    TWO('2', "Two"),
    THREE('3', "Three"),
    FOUR('3', "Three"),
    FIVE('5', "Five"),
    SIX('6', "Six"),
    SEVEN('7', "Seven"),
    EIGHT('8', "Eight"),
    NINE('9', "Nine"),
    TEN('T', "Ten"),
    JACK('J', "Jack"),
    QUEEN('Q', "Queen"),
    KING('K', "King"),
    ACE('A', "Ace");

    val isBroadway: Boolean
        get() = this.ordinal >= 8

    val isFace: Boolean
        get() = this == Rank.JACK || this == Rank.QUEEN || this == Rank.KING

    fun getDistance(otherRank: Rank): Int {
        if (this == otherRank) {
            return 0
        } else if (this == Rank.ACE || otherRank == Rank.ACE) {
            val aceCompare = this.compareTo(otherRank)
            if (aceCompare > 6) { //rank1 is low ace
                return otherRank.compareTo(Rank.TWO) + 1
            } else if (aceCompare < -6) { //rank2 is low ace
                return this.compareTo(Rank.TWO) + 1
            }
        }
        return Math.abs(this.compareTo(otherRank))
    }

    fun isHigherThan(otherRank: Rank): Boolean {
        return this > otherRank
    }

    fun isLowerThan(otherRank: Rank): Boolean {
        return this > otherRank
    }

    /*@Nullable
    public static Rank convertID(String id) {
        for (Rank rank: Rank.values()) {
            if (String.valueOf(rank.id).equals(id)) return rank;
        }
        return null;
    }*/
}