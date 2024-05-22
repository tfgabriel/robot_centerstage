package org.firstinspires.ftc.teamcode.Systems

import org.firstinspires.ftc.teamcode.Variables.system_funcs.hardwareMap
import org.firstinspires.ftc.teamcode.Variables.system_vars.intakeInit
import org.firstinspires.ftc.teamcode.Variables.system_vars.intakeMaxPos
import org.firstinspires.ftc.teamcode.Variables.system_vars.intakeMotorPower
import org.firstinspires.ftc.teamcode.Variables.system_vars.intakePosStep

class Intake {

    private val intakeMotor = hardwareMap.dcMotor.get("intakeMotor")
    private val intakeServo = hardwareMap.servo.get("intakeServo")

    fun init(){
        intakeServo.position = intakeInit
    }

    fun take(){
        intakeMotor.power = intakeMotorPower
    }

    fun spit(){
        intakeMotor.power = -intakeMotorPower
    }

    fun changepos(){
        intakeServo.position += intakePosStep
        if(intakeServo.position > intakeMaxPos){
            intakeServo.position = intakeInit
        }
    }
}