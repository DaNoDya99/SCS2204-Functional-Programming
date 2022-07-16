object Q1 {
    def power(n: Double,exp: Int): Double = exp match {
        case 0 => 1
        case _ => n*power(n,exp - 1)
    }

    def areaOfDisk(r: Double): Double = {
        var area = 3.14*power(r,2)
        area   
    }

    def getArea(area: Double) : Unit = {
        println("Area of the disk: "+area)
    }

    def main(args: Array[String]) : Unit = {
        getArea(areaOfDisk(5))
    }
}
