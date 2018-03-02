package com.pokerplayer.model.card

data class Card(val rank: Rank, val suit: Suit) {
    override fun toString(): String {
        return "Card(${rank.id}${suit.id})"
    }
}
