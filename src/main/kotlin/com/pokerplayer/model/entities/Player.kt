package com.pokerplayer.model.entities

import com.pokerplayer.model.hand.Pocket


class Player(
        internal var name: String,
        internal var seatNumber: Int,
        internal var chips: Int,
        internal var pocket: Pocket)