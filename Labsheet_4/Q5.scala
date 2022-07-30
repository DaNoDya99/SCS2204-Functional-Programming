object Q5 {
    def toUpper(s: String): String = {
        s.toUpperCase()
    }

    def toLower(s: String): String = {
        s.toLowerCase()
    }

    def charToUpper(s:String,n: Int): String = {
        var name = ""
        var i = 0
        for(e <- s){
            if(i == n-1) name = name.concat(e.toUpper.toString())
            else name = name.concat(e.toString())

            i += 1 
        }

        name
    }

    def formatNames(name: String)(function: String => String): String = {
        function(name)
    }


    def main(args: Array[String]): Unit = {
        println(formatNames("Benny")(toUpper(_)))
        println(charToUpper("Niroshan",2))
        println(formatNames("Saman")(toLower(_)))
        println(charToUpper("Kumara",6))
    }
}
