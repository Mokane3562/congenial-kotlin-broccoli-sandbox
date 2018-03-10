package com.pokerplayer.model.game

import com.pokerplayer.model.entities.Player
import com.pokerplayer.model.util.ActionType

data class Action(val actor: Player, val type: ActionType, var chipAmount: Int)