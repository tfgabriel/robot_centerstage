package org.firstinspires.ftc.teamcode.Variables

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.hardware.HardwareMap
import org.firstinspires.ftc.robotcore.external.Telemetry
import org.firstinspires.ftc.teamcode.Systems.Claws
import org.firstinspires.ftc.teamcode.Systems.Controller
import org.firstinspires.ftc.teamcode.Systems.Drivetrain
import org.firstinspires.ftc.teamcode.Systems.Drone_launcher
import org.firstinspires.ftc.teamcode.Systems.Intake
import org.firstinspires.ftc.teamcode.Systems.Slides
import org.firstinspires.ftc.teamcode.Systems.outtake

object system_funcs {

    lateinit var hardwareMap: HardwareMap
    lateinit var lom: LinearOpMode
    lateinit var controller: Controller
    lateinit var dash: FtcDashboard
    lateinit var telemetry: Telemetry

    lateinit var claws: Claws
    lateinit var drivetrain: Drivetrain
    lateinit var droneLauncher: Drone_launcher
    lateinit var intake: Intake
    lateinit var outtake: outtake
    lateinit var slides: Slides
    fun initx(lom_real: LinearOpMode){
        lom = lom_real
        hardwareMap = lom.hardwareMap
        telemetry = lom.telemetry
        controller = Controller()
        init_systems()
    }

    fun init_systems(){
        drivetrain = Drivetrain()
        droneLauncher = Drone_launcher()
        droneLauncher.init()
        claws = Claws()
        claws.initpos()
        intake =  Intake()
        intake.init()
        slides = Slides()
    }
}