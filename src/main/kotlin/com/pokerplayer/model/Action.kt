package com.pokerplayer.model

data class Action(val type: Type, val amount: Int) {
    enum class Type {
        FOLD,
        CALL,
        RAISE,
        CHECK
    }
}