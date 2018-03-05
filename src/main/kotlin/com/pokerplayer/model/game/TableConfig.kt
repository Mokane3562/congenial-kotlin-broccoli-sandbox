package com.pokerplayer.model.game

data class TableConfig(
    val smallBlind: Int = 5,
    val bigBlind: Int = 10,
    val gameType: String = "holdem", //fixme: enum
    val startingStackSize: Int = 1000,
    val maxPlayers: Int = 10,
    val minPlayers: Int = 2
)
