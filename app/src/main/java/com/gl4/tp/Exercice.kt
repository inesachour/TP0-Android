package com.gl4.tp

import kotlin.math.abs

data class Point (var x: Int, var y: Int)

fun distance(p: Point, q: Point): Int{
    return abs(p.x - q.x) + abs(p.y - q.y)
}

class Rectangle(var p : Point = Point(0,0), var q: Point = Point(1,1)){
    override fun toString(): String {
        return "p=$p q=$q"
    }

    fun surface() : Int{
        val d1 = distance(p,Point(q.x,p.y))
        val d2 = distance(p, Point(p.x,q.y))
        return d1 * d2
    }
}

fun main(args: Array<String>){
    val rectanlges = listOf<Rectangle>(
        Rectangle(),
        Rectangle(Point(-3,-3)),
        Rectangle(q=Point(2,2)),
        Rectangle(Point(3,3), Point(6,9))
    )

    rectanlges.forEach {
        println("surface : ${it.surface()}")
    }
}