package com.pokerplayer.model.entities

import com.pokerplayer.model.game.Action
import com.pokerplayer.model.game.ActionType
import com.pokerplayer.model.hand.Pocket

class Player(val name: String, var chips: Int) {
    lateinit var pocket: Pocket

    fun act(type: ActionType, amount: Int): Action {
        return Action(this, type, amount)
    }
}
