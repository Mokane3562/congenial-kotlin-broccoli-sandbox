package com.pokerplayer.model.card

import java.util.Collections
import java.util.ArrayList
import java.util.ArrayDeque


class Deck : Iterable<Card> {
    private val cards = ArrayDeque<Card>()

    init {
        val list = ArrayList<Card>(52)
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                list.add(Card(rank, suit))
            }
        }
        Collections.shuffle(list)
        cards.addAll(list)
    }

    val size: Int
        get() = cards.size

    fun draw(): Card {
        return cards.pop()
    }

    override fun iterator(): Iterator<Card> {
        return cards.iterator()
    }
}