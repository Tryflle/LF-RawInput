package me.nyaa.rawinput.utils

import me.nyaa.rawinput.mouses
import net.minecraft.client.MouseInput

class RawInputMouseInput : MouseInput() {

    override fun updateMouse() {
        x = 0
        y = 0

        for (mouse in mouses) {
            mouse.poll()
            x += mouse.x.pollData.toInt()
            y -= mouse.y.pollData.toInt()
        }
    }
}