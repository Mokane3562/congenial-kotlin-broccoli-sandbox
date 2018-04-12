package com.pokerplayer

import com.pokerplayer.model.Card
import com.pokerplayer.model.Player
import com.pokerplayer.util.Deck
import com.pokerplayer.util.TableConfig
import java.util.*

class Main() {
    fun main(args : Array<String>) {
        println("Hello, world!")
    }
    /*val boardCards = ArrayList<Card>(5)
    private val deck = Deck()
    private val actionHistory = ArrayList<Action>()
    private var currentStreet = PostFlopStreetType.PREFLOP

    private var dealerIndex = 0
    val dealer: Player
        get() = players[dealerIndex]
    val smallBlind: Player
        get() = players[(dealerIndex + 1) % players.size]
    val bigBlind: Player
        get() = players[(dealerIndex + 2) % players.size]

    constructor(player1: Player, player2: Player) : this(ArrayList(Arrays.asList(player1, player2)))

    init {
        if (players.size > config.maxPlayers) throw IllegalArgumentException("Too many players")
        if (players.size < config.minPlayers) throw IllegalArgumentException("Too few players")
        for (player: Player in players) {
            player.chips = config.startingStackSize
        }
        dealerIndex = Random().nextInt(players.size)
    }

    fun addPlayer(player: Player) {//testme
        if (players.size + 1 > config.maxPlayers) throw IllegalArgumentException("Too many players")
        players.add(player)
    }

    fun removePlayer(player: Player) {//testme
        if (players.size - 1 < config.minPlayers) throw IllegalArgumentException("Too few players")
        players.remove(player)
    }

    fun newRound() {//testme
        boardCards.removeAll(boardCards)
        dealerIndex = (dealerIndex + 1) % players.size
        currentStreet = PostFlopStreetType.PREFLOP
        deck.shuffle()
    }

    fun startGame() {//testme
        newRound()
        post(Action(smallBlind, ActionType.SMALL_BLIND, config.smallBlind))
        post(Action(bigBlind, ActionType.BIG_BLIND, config.bigBlind))
        for (player: Player in players) {
            player.leftCard = deck.draw()
            player.rightCard = deck.draw()
        }
        //while there are more actions to come
        //request action from player
        for (postFlopStreet: PostFlopStreetType in PostFlopStreetType.values()) {
            currentStreet = postFlopStreet
            //while there are more actions to come
                //request action from player
        }
    }

    private fun post(action: Action) {//testme
        action.actor.chips -= action.chipAmount
        config.currentPot += action.chipAmount
        actionHistory.add(action)
    }*/
}
