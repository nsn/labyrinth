@file:JvmName("TeaVMLauncher")

package com.nightspawn.labyrinth.teavm

import com.github.xpenatan.gdx.backends.teavm.TeaApplicationConfiguration
import com.github.xpenatan.gdx.backends.teavm.TeaApplication
import com.nightspawn.labyrinth.Labyrinth

/** Launches the TeaVM/HTML application. */
fun main() {
    val config = TeaApplicationConfiguration("canvas").apply {
        width = 640
        height = 480
    }
    TeaApplication(Labyrinth(), config)
}
