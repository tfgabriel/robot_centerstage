package org.firstinspires.ftc.teamcode.Systems

import org.firstinspires.ftc.teamcode.Variables.system_funcs.lom
import org.firstinspires.ftc.teamcode.Variables.system_vars

class Controller {
    private val g1 = lom.gamepad1
    private val g2 = lom.gamepad2

    var triangle = g2.triangle
    var cross = g2.cross
    var circle = g2.circle
    var square = g2.square

    var up = g2.dpad_up
    var down = g2.dpad_down
    var left = g2.dpad_left
    var right = g2.dpad_right

    var lstick1_x = g2.left_stick_x
    var lstick1_y = g2.left_stick_y

    var rstick1_x = g2.right_stick_x
    var rstick1_y = g2.right_stick_y

    var lbump = g2.left_bumper
    var ltrig = g2.left_trigger

    var rbump = g2.right_bumper
    var rtrig = g2.right_trigger

    var lstick2_x = g1.left_stick_x
    var lstick2_y = g1.left_stick_y

    var rstick2_x = g1.right_stick_x
    var rstick2_y = g1.right_stick_y

    var start1 = g1.start
    var start2 = g2.start

    var options1 = g1.options
    var options2 = g2.options
}