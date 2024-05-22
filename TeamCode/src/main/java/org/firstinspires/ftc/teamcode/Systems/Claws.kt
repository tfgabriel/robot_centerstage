package org.firstinspires.ftc.teamcode.Systems

import org.firstinspires.ftc.teamcode.Variables.system_funcs.hardwareMap
import org.firstinspires.ftc.teamcode.Variables.system_vars.claw1ClosePos
import org.firstinspires.ftc.teamcode.Variables.system_vars.claw1Init
import org.firstinspires.ftc.teamcode.Variables.system_vars.claw1OpenPos
import org.firstinspires.ftc.teamcode.Variables.system_vars.claw2ClosePos
import org.firstinspires.ftc.teamcode.Variables.system_vars.claw2Init
import org.firstinspires.ftc.teamcode.Variables.system_vars.claw2OpenPos

class Claws {

    private val claw1 = hardwareMap.servo.get("claw1")
    private val claw2 = hardwareMap.servo.get("claw2")

    fun initpos(){
        claw1.position = claw1Init
        claw2.position = claw2Init
    }
    fun grab(){
        claw1.position = claw1ClosePos
        claw2.position = claw2ClosePos
    }

    fun drop(){
        claw1.position = claw1OpenPos
        claw2.position = claw2OpenPos
    }
}