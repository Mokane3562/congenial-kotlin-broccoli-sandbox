package com.pokerplayer

import org.junit.jupiter.api.Test
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class SimpleJUnit4Test
{
    @Test
    fun shouldPrintInfoAboutJUnit4Test()
    {
        println("JUnit 4 test")
    }
}
