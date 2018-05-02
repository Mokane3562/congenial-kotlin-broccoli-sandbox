package com.pokerplayer.model

sealed class Action
class Fold : Action()
class Check : Action()
data class Call(val amount: Int) : Action()
data class Raise(val amount: Int) : Action()
