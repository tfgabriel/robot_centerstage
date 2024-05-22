package org.firstinspires.ftc.teamcode.Systems

import org.firstinspires.ftc.teamcode.Variables.system_funcs.hardwareMap
import org.firstinspires.ftc.teamcode.Variables.system_funcs.lom
import java.lang.Math.PI

class Drivetrain {

    private val lbmotor = hardwareMap.dcMotor.get("LB")
    private val lfmotor = hardwareMap.dcMotor.get("LF")

    private val rbmotor = hardwareMap.dcMotor.get("RB")
    private val rfmotor = hardwareMap.dcMotor.get("RF")

    fun drive(){
        var theta = Math.atan2(lom.gamepad1.left_stick_x.toDouble(), lom.gamepad1.left_stick_y.toDouble())
        var sin = Math.sin(theta - PI / 4)
        var cos = Math.cos(theta - PI/4)

        var power = Math.hypot(lom.gamepad1.left_stick_x.toDouble(), lom.gamepad1.left_stick_y.toDouble())

        var turn = lom.gamepad1.right_stick_x.toDouble()

        lbmotor.power = power * sin + turn
        rbmotor.power = power * sin - turn
        lfmotor.power = power * cos + turn
        rfmotor.power = power * cos - turn

        if(power + Math.abs(turn) > 1){
            lbmotor.power /= power + turn
            rbmotor.power /= power + turn
            lfmotor.power /= power + turn
            rfmotor.power /= power + turn
        }
    }
}