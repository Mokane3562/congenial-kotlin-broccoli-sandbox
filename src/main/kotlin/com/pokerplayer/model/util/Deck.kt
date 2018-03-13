package com.pokerplayer.model.util

import java.util.*
import kotlin.collections.ArrayList


class Deck() {
    private var cards: ArrayDeque<Card> = ArrayDeque(52)

    val size: Int
        get() = cards.size

    init {
        val list = ArrayList(Card.all)
        list.shuffle()
        cards.addAll(list)
    }

    fun draw(): Card {
        return cards.pop()
    }

    fun shuffle() {//fixme yuck lots of garbage
        val tempList = ArrayList(cards.toList())
        tempList.shuffle()
        val newDeck = ArrayDeque<Card>()
        newDeck.addAll(tempList)
        cards = newDeck
    }
}
