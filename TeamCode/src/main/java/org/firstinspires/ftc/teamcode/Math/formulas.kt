package org.firstinspires.ftc.teamcode.Math

class formulas {

    fun max(a: Double, b: Double): Double{
        return if(a > b) {
            a
        }else {
            b
        }
    }

    fun min(a: Double, b: Double): Double{
        return if(a < b) {
            a
        }else {
            b
        }
    }

    fun abs(a: Double): Double{
        return if(a < 0){
            -a
        }
        else{
            a
        }
    }
}