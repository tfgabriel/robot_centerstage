package org.firstinspires.ftc.teamcode.Variables

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.hardware.HardwareMap
import org.firstinspires.ftc.teamcode.Systems.Claws
import org.firstinspires.ftc.teamcode.Systems.Controller
import org.firstinspires.ftc.teamcode.Systems.Drivetrain
import org.firstinspires.ftc.teamcode.Systems.Drone_launcher
import org.firstinspires.ftc.teamcode.Systems.Intake
import org.firstinspires.ftc.teamcode.Systems.outtake
import org.firstinspires.ftc.teamcode.Systems.Slides
import org.firstinspires.ftc.robotcore.external.Telemetry

object system_vars {

    //init positions
    val slideInit: Int = 0
    val claw1Init: Double = 0.0
    val claw2Init: Double = 0.0
    val clawRotateInit: Double = 0.0
    val intakeInit: Double = 0.0
    val droneInit: Double = 0.0

    //position
    val slideUpPos: Int = 0
    val slideDownPos: Int = 0

    val claw1OpenPos: Double = 0.0
    val claw1ClosePos: Double = 0.0

    val claw2OpenPos: Double = 0.0
    val claw2ClosePos: Double = 0.0

    val clawRotateStep: Double = 0.0

    val droneLaunch: Double = 0.0

    val intakePosStep: Double = 0.0
    val intakeMaxPos: Double = 0.0
    val intakeMotorPower: Double = 0.0

    val trigtresh: Double = 0.0
}