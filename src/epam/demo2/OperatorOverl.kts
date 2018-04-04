
data class Point(var x: Int, var y: Int)

    operator fun Point.plus(p: Point) = Point(x + p.x, y + p.y)

var point1 = Point(1, 1)
var point2 = Point(3, 6)

print(point1 + point2)
