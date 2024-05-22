package org.firstinspires.ftc.teamcode.Systems

import org.firstinspires.ftc.teamcode.Variables.system_funcs.hardwareMap
import org.firstinspires.ftc.teamcode.Variables.system_vars.droneInit
import org.firstinspires.ftc.teamcode.Variables.system_vars.droneLaunch

class Drone_launcher {

    private val launcher = hardwareMap.servo.get("launcher")

    fun init(){
        launcher.position = droneInit
    }

    fun launch(){
        launcher.position = droneLaunch
    }
}