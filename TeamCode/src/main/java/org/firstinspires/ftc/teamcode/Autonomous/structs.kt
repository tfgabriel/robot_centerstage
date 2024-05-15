package org.firstinspires.ftc.teamcode.Autonomous

import java.lang.Math.sqrt

class pose (var x: Double, var y: Double, var h: Double){
    constructor() : this(0.0, 0.0, 0.0)
    constructor(v: Vec2D, h: Double) : this(v.x, v.y, h)

    fun addition(p: pose) = pose(x + p.x, y + p.y, h + p.h)
    fun subtraction(p: pose) = pose(x - p.x, y - p.y, h - p.h)
    fun multiply(p: pose) = pose(x * p.x, y * p.y, h * p.h)
    fun division(p: pose) = pose(x / p.x, y / p.y, h / p.h)
    fun multiply_byscalar(p: pose, a: Double) = pose(x * a, y - p.y, h - p.h)

}

class Vec2D(var x: Double, var y: Double){
    constructor(): this(0.0, 0.0)

    fun addition(v: Vec2D) = Vec2D(x + v.x, y + v.y)
    fun subtraction(v: Vec2D) = Vec2D(x - v.x, y - v.y)
    fun multiply(v: Vec2D) = Vec2D(x * v.x, y * v.y)
    fun division(v: Vec2D) = Vec2D(x / v.x, y / v.y)
    fun multiply_byscalar(a: Double) = Vec2D(x * a, y * a)

}