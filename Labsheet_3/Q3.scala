object Q3 {
    def power(n: Double,exp: Int): Double = exp match {
        case 0 => 1
        case _ => n*power(n,exp - 1)
    }

    def calArea(r: Double): Double = {
        var area = (4.toDouble/3)*(22.toDouble/7)*power(r,3)
        area
    }

    def getAreaOfSphere(area: Double): Unit = {
        println("Area of the sphere: "+area)
    }    

    def main(args: Array[String]): Unit = {
        getAreaOfSphere(calArea(5))
    }
}
