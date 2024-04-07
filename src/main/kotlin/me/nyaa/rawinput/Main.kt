package me.nyaa.rawinput

import me.nyaa.rawinput.listener.MouseListener
import net.fabricmc.api.ModInitializer

class Main : ModInitializer {

    override fun onInitialize() {
        environ.addControllerListener(MouseListener())
    }
}