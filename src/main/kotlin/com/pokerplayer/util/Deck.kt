package com.pokerplayer.util

import com.pokerplayer.model.Card
import java.util.*
import kotlin.collections.ArrayList

class Deck() {
    private var cards: ArrayDeque<Card> = ArrayDeque()

    val size: Int
        get() = cards.size

    init {
        val list = ArrayList(Card.getFullSet())
        list.shuffle()
        cards.addAll(list)
    }

    fun draw(): Card {
        return cards.pop()
    }

    fun shuffle() {
        val tempList = ArrayList(cards.toList())
        tempList.shuffle()
        val newDeck = ArrayDeque<Card>()
        newDeck.addAll(tempList)
        cards = newDeck
    }
}
