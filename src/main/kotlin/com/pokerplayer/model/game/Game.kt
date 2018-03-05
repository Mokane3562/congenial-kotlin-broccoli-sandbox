package com.pokerplayer.model.game

import com.pokerplayer.model.card.Card
import com.pokerplayer.model.card.Deck
import com.pokerplayer.model.entities.Player
import java.util.*
import kotlin.collections.LinkedHashSet


class Game(
    val players: LinkedHashSet<Player>,
    private val config: TableConfig = TableConfig()
) {
    private val deck = Deck()
    val board = ArrayList<Card>(5)
    var dealerIndex = 0

    constructor(player1: Player, player2: Player) : this(LinkedHashSet(Arrays.asList(player1, player2)))

    init {
        if (players.size > config.maxPlayers) throw IllegalArgumentException("Too many players")
        if (players.size < config.minPlayers) throw IllegalArgumentException("Too few players")
        for (player: Player in players) {
            player.chips = config.startingStackSize
        }
        dealerIndex = Random().nextInt(players.size)
    }

    fun addPlayer(player: Player) {
        if (players.size + 1 > config.maxPlayers) throw IllegalArgumentException("Too many players")
        players.add(player)
    }

    fun removePlayer(player: Player) {
        if (players.size - 1 < config.minPlayers) throw IllegalArgumentException("Too few players")
        players.remove(player)
    }

    fun newRound() {//todo test
        board.removeAll(board)
        dealerIndex = (dealerIndex + 1) % players.size
        deck.shuffle()
    }
}
