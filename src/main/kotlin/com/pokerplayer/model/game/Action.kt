package com.pokerplayer.model.game

import com.pokerplayer.model.entities.Player

class Action(
        private val actor: Player,
        private val type: ActionType,
        internal var chipAmount: Int)