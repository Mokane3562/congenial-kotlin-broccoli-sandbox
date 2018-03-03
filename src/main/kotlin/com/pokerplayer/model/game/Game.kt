package com.pokerplayer.model.game

import com.pokerplayer.model.card.Card
import com.pokerplayer.model.card.Deck
import com.pokerplayer.model.entities.Player
import java.util.*


class Game(private val players: ArrayList<Player> = ArrayList(10), private val config: TableConfig = TableConfig()) {
    private val deck = Deck()
    private val boardCards = ArrayList<Card>(5)
    private var dealerIndex = 0
    //private val state: State? = null

    fun setUp() {
        for (i in 1..config.numPlayers) {
            players.add(Player("Player$i", config.startingStackSize))
        }
        dealerIndex = Random().nextInt(players.size)
    }

    fun setUpRound() {
        dealerIndex = dealerIndex+1 % players.size
        deck.shuffle()
    }
}