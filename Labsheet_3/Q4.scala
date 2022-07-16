object Q4 {
    def shippingCost(n: Int): Double = n match {
        case x if x < 50 => n*3
        case _ => 50*3 + (n-50)*0.75
    }

    def calPrice(n: Int): Double = {
        var price = shippingCost(n) + 24.95*0.4*n
        price
    }

    def getPrice(p: Double):Unit = {
        println("Whole sale cost is "+p)
    }

    def main(args: Array[String]): Unit = {
        getPrice(calPrice(60))
    }
}
