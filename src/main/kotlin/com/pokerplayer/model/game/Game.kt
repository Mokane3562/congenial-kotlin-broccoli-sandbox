package com.pokerplayer.model.game

import com.pokerplayer.model.card.Card
import java.util.ArrayList
import com.pokerplayer.model.card.Deck
import com.pokerplayer.model.entities.Player


class Game
(private val players: List<Player>) {
    private val deck = Deck()
    private val board = ArrayList<Card>(5)
    private val state: State? = null
}