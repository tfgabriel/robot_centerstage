package org.firstinspires.ftc.teamcode.Systems

import org.firstinspires.ftc.teamcode.Variables.system_funcs.hardwareMap
import org.firstinspires.ftc.teamcode.Variables.system_funcs.lom


class Slides {
    private val lslide = hardwareMap.dcMotor.get("leftslide")
    private val rslide = hardwareMap.dcMotor.get("rightslide")

    fun move(){
        lslide.power = lom.gamepad2.right_stick_x.toDouble()
        rslide.power = lom.gamepad2.right_stick_x.toDouble()
    }
}