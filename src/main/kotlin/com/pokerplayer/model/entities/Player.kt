package com.pokerplayer.model.entities

import com.pokerplayer.model.game.Action
import com.pokerplayer.model.util.ActionType
import com.pokerplayer.model.util.Card

class Player(val name: String) {
    var chips: Int = 0
    lateinit var leftCard: Card
    lateinit var rightCard: Card

    fun act(type: ActionType, amount: Int): Action {
        return Action(this, type, amount)
    }
}
