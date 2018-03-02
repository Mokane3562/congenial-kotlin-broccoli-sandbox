package com.pokerplayer.model.card

data class Card(private val rank: Rank, private val suit: Suit) {

    override fun toString(): String {
        return "Card(${rank.id}${suit.id})"
    }
}
