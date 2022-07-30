object Q4 {
  
    def matching(n: Int): Unit = n match {
        case x if x < 0 || x == 0 => println("Negative/Zero")
        case x if x%2 == 0 => println("Even")
        case x if x%2 == 1 => println("Odd")
    }

    def main(args: Array[String]): Unit = {
        print("Input Integer: ")
        var n = scala.io.StdIn.readInt()

        matching(n)
    }
}
