package org.firstinspires.ftc.teamcode.Localizer

import com.qualcomm.robotcore.hardware.DcMotor
import org.firstinspires.ftc.teamcode.Variables.system_vars.hardwareMap


class encoder(private val motor: DcMotor){
    val reversed: Boolean = false

    init{
        motor.mode = DcMotor.RunMode.STOP_AND_RESET_ENCODER
        motor.mode = DcMotor.RunMode.RUN_WITHOUT_ENCODER
    }

    fun getValue(): Int = motor.currentPosition * (if (reversed) 1 else -1)
}
class threewheellocalizer {
    private val fwd_ticks_per_cm: Int = 2
    private val lat_ticks_per_cm: Int = 3

    private val right_deadwheel_encoder = encoder(hardwareMap.dcMotor.get("REM"))
    private val left_deadwheel_encoder = encoder(hardwareMap.dcMotor.get("LEM"))
    private val perpendicular_deadwheel_encoder = encoder(hardwareMap.dcMotor.get("PEM"))
}