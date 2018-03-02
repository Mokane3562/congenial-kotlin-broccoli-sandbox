package com.pokerplayer.model.card

import java.util.*


data class Deck(private val cards: ArrayDeque<Card> = ArrayDeque(52)) {
    val size: Int
        get() = cards.size

    init {
        val list = ArrayList<Card>(52)
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                list.add(Card(rank, suit))
            }
        }
        list.shuffle()
        cards.addAll(list)
    }

    fun draw(): Card {
        return cards.pop()
    }
}
