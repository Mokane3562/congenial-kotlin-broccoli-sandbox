package com.pokerplayer

import com.pokerplayer.model.Card
import com.pokerplayer.model.Hand
import com.pokerplayer.util.HandAnalyzer
import java.lang.IllegalArgumentException

fun main(args : Array<String>) {
    val hands = arrayOf(
        Hand.fromString("2h 2d 2c Kc Qd"),
        Hand.fromString("2h 5h 7d 8c 9s"),
        Hand.fromString("Ah 2d 3c 4c 5d"),
        Hand.fromString("2h 3h 2d 3c 3d"),
        Hand.fromString("2h 7h 2d 3c 3d"),
        Hand.fromString("2h 7h 7d 7c 7s"),
        Hand.fromString("Th Jh Qh Kh Ah"),
        Hand.fromString("4h 4s Ks 5d Ts"),
        Hand.fromString("Qc Tc 7c 6c 4c")
    )
    try {
        Hand.fromString("Ah Ah 7c 6c 4c")
    }
    catch (e: IllegalArgumentException) {
        println(e.message)
    }
    hands.forEach {
        println("$it: ${HandAnalyzer.analyzeHand(it)}")
    }
    Card.getFullSet().sorted()
            .map { c -> c.toString() }
            .forEach { s -> println(s) }
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
