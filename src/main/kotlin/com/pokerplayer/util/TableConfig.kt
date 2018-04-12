package com.pokerplayer.util

data class TableConfig(
    val smallBlind: Int = 5,
    val bigBlind: Int = 10,
    val gameType: String = "holdem", //fixme: enum
    val startingStackSize: Int = 1000,
    val maxPlayers: Int = 10,
    val minPlayers: Int = 2,
    var currentPot: Int = 0
)
