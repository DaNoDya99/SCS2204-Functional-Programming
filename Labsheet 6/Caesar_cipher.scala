def Cipher(Data:String,Algorithm:(Char,Int)=>Char,shift:Int=1):String=Data.map(Algorithm(_,shift))

def Encryption(Letter:Char,shift:Int=1):Char=Letter match
    case x if x.isUpper => ((x-65+shift)%26+65).toChar
    case x if x.isLower => ((x-97+shift)%26+97).toChar

def Decryption(Letter:Char,shift:Int=1):Char=Letter match
    case x if !x.isLetter => x
    case x if x.isUpper => ((x-65+26-shift)%26+65).toChar
    case x if x.isLower => ((x-97+26-shift)%26+97).toChar
    
@main
def run()={
    val ct=Cipher("HelloWorld",Encryption)
    println("Encrpted : "+ct)
    val dt=Cipher(ct,Decryption)
    println("Decrypted : "+dt)
}