import Array._

object Q1{

    def encryptHelper(c: Char, key: Int) : Char = {
        var ch = ' ';
        var asciiVal = 0;
        if(c.isUpper){  
            asciiVal = c.toInt%90 + key;

            if(asciiVal >= 65){
                ch = asciiVal.toChar;
            } else{
                ch = (asciiVal + 64).toChar;
            }
        } else if(c.isLower) {
            asciiVal = c.toInt%122 + key;

            if(asciiVal >= 97){
                ch = asciiVal.toChar;
            } else{
                ch = (asciiVal + 96).toChar;
            }
        } else {
            ch=c
        }
        ch
    } 
    
    def decryptHelper(c: Char, key: Int) : Char = {
        var ch = ' ';
        var asciiVal = 0;
        if(c.isUpper){  
            asciiVal = c.toInt%90 - key;
            if(asciiVal >= 65){
                ch = asciiVal.toChar;
            } else{
                if(asciiVal == -1){
                    ch = 'Y'
                }else{
                    ch = (asciiVal + 26).toChar;
                }
            }
        } else if(c.isLower) {
            asciiVal = c.toInt%122 - key;

            if(asciiVal >= 97){
                ch = asciiVal.toChar;
            } else{
                if(asciiVal == -1){
                    ch = 'y'
                }else{
                    ch = (asciiVal + 26).toChar;
                }
            }
        } else {
            ch=c
        }
        ch
    } 

    def encrypt(str: String, key: Int,itr: Int = 0,decStr: String = ""): String = {
        var n = str.length();
        if(n>itr){
            encrypt(str,key,itr+1,decStr + encryptHelper(str.charAt(itr),key));
        }else{
            decStr
        }
    }
    
    def decrypt(str: String, key: Int,itr: Int = 0,encStr: String = ""): String = {
        var n = str.length();
        if(n>itr){
            decrypt(str,key,itr+1,encStr + decryptHelper(str.charAt(itr),key));
        }else{
            encStr
        }
    }

    def cipher(str: String, key: Int) :Unit = {
        var encStr = encrypt(str,key);
        var decStr = decrypt(encStr,key);

        println("\nEncrypted Message: "+encStr);
        println("\nDecrypted Message: "+decStr);
    }

    def main(args: Array[String]) : Unit = {
        println("Input the message: ");
        var string = scala.io.StdIn.readLine();
        println("\nInput the key: ");
        var key = scala.io.StdIn.readInt();

        cipher(string,key);
    }
}