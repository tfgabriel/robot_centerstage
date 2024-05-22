package org.firstinspires.ftc.teamcode.TeleOp

import com.outoftheboxrobotics.photoncore.Photon
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.Variables.system_funcs
import org.firstinspires.ftc.teamcode.Variables.system_funcs.controller
import org.firstinspires.ftc.teamcode.Variables.system_funcs.slides
import org.firstinspires.ftc.teamcode.Variables.system_vars.trigtresh


@TeleOp
@Photon
class teleop: LinearOpMode() {
    override fun runOpMode() {
        while(!isStopRequested){
            system_funcs.initx(this)

            if(controller.circle){

            }

            if(controller.square){

            }

            if(controller.triangle){

            }

            if(controller.cross){

            }

            if(controller.ltrig > trigtresh){

            }

            if(controller.rtrig > trigtresh){

            }

            if(Math.abs(controller.rstick2_x) > 0.0F){
                slides.move()
            }
        }
    }
}