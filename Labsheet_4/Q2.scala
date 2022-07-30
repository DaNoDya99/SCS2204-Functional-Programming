case class shoppingCart(name: String,price: Double,quantity: Int)

object Q2{
    def printCart(array: Array[shoppingCart]): Unit = {
        if(!array.isEmpty){
            println(array.head.quantity+" "+array.head.name+" at Rs "+array.head.price+" each.")
            printCart(array.tail)
        }
    }

    def findVanillaIceCream(array: Array[shoppingCart]): Unit = {
        if(!array.isEmpty){
            if(array.head.name == "Vanilla Ice Cream"){
                println(array.head.quantity+" "+array.head.name+" at Rs "+array.head.price+" each.")
            } else {
                println("Found another item")
            }

            findVanillaIceCream(array.tail)
        }
    }
  
    def main(args: Array[String]): Unit = {
        var array: Array[shoppingCart] = new Array[shoppingCart](3)

        var a = new shoppingCart("Vanilla Ice Cream",3.99,13)
        var b = new shoppingCart("Chocolate Biscuits",4,6)
        var c = new shoppingCart("Cupcakes",7.77,7)

        array(0) = a
        array(1) = b
        array(2) = c

        printCart(array)
        findVanillaIceCream(array)
    }
}
