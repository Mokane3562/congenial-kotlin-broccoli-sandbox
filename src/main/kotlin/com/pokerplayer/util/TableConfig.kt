package com.pokerplayer.util

import com.pokerplayer.model.Table

data class TableConfig(
    val smallBlind: Int = 5,
    val bigBlind: Int = 10,
    val tableType: Table.Type = Table.Type.HOLDEM,
    val startingStackSize: Int = 1000,
    val maxPlayers: Int = 10,
    val minPlayers: Int = 2,
    val turnStrategy: Array<Int> = arrayOf(0, 3, 1, 1),
    val isLimit: Boolean = false,
    val minRaise: Int = 10,
    val firstDealerIndex: Int = 0,
    val numSuits: Int = 4,
    val numRanks: Int = 13,
    val numHoleCards: Int = 2
)
