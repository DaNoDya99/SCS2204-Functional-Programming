object Q2 {
    def convertToFarenhite(c: Double) : Double = {
        var F = c*1.80 + 32
        F
    }

    def getTempInFarenhite(T: Double) : Unit = {
        println("Temperatue in farenhite "+T)
    }

    def main(args: Array[String]) : Unit = {
        getTempInFarenhite(convertToFarenhite(35))
    }
}
