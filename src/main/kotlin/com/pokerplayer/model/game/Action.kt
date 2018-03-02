package com.pokerplayer.model.game

import com.pokerplayer.model.entities.Player

data class Action(val actor: Player, val type: ActionType, var chipAmount: Int)