package com.pokerplayer.util

import com.pokerplayer.model.Card
import java.util.*
import kotlin.collections.ArrayList

class Deck()
{
    private val MAX_CARDS = 52
    private var cards = Array<Card>(MAX_CARDS, {i -> Card(i)})
    private var nextCardIndex = 0

    val size: Int
        get() = cards.size

    init
    {
        shuffle()
    }

    fun shuffle() {
        val tempList = ArrayList(cards.toList())
        tempList.shuffle()
        cards = tempList.toTypedArray()
        reset()
    }

    fun reset()
    {
        nextCardIndex = 0
    }

    fun draw(): Card
    {
        if (nextCardIndex >= MAX_CARDS)
        {
            throw IllegalStateException("no cards left in the deck!")
        }
        return cards[nextCardIndex++]
    }
}
