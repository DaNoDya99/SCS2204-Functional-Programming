trait operators {
    def +(p: Point):Point
    def move(x: Int,y: Int):Point
    def distance(p: Point): Double
    def invert(): Point
}

case class Point(a: Int, b: Int) extends operators{
    override def +(p: Point): Point = Point(a+p.a,b+p.b)

    override def move(x: Int, y: Int): Point = Point(a+x,b+y)

    override def distance(p: Point): Double = {
        val d = Math.pow((a - p.a),2) + Math.pow((b-p.b),2)
        Math.pow(d,0.5);
    }

    override def invert(): Point = Point(b,a)
}

object  p {
    def main(args: Array[String]) : Unit = {
        var p1 = Point(1,4)
        var p2 = Point(3,2)

        println("\nAdd p1 and p2 : " + (p1+p2))
        p2 = p2.move(2,5)
        println("\nMove p2 by (2,5) : " + p2)
        println("\nDistance between p1 and p2 : " + p1.distance(p2));
        println("\nInvert p1 : " + p1.invert());
    }
}