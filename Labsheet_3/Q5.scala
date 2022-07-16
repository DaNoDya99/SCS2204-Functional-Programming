object Q5 {
    def easyPace(n: Int) : Int = {
        n*8
    }

    def tempoPace(n: Int) :  Int = {
        n*7
    }

    def totalTime(easy: Int, tempo: Int):Unit = {
        println("Total running time: " + easyPace(easy) + tempoPace(tempo))
    }

    def main(args: Array[String]): Unit = {
        totalTime(4,3)
    }
}
