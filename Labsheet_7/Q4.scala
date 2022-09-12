class Account(bal: Double){
    var balance: Double = bal;

    def Interest(x: Account):Account = {
        if(x.balance > 0) {
            x.balance = x.balance + x.balance*0.05;
        } else {
            x.balance = x.balance + x.balance*0.1;
        }
        x;
    }
        

    override def toString(): String = "$"+balance;
}

class  Bank(Acc: List[Account]) {
    def Accounts: List[Account] = Acc;
    def NegativeBalance():List[Account] = Accounts.filter(x => x.balance < 0);
    def TotalBalance(): Double = Accounts.map(x=> x.balance).sum;
    def ApplyInterest() = Accounts.map(x=>x.Interest(x))
}

object Q4 {
    def main(args: Array[String]) : Unit = {
        val a1 = Account(30000);
        val a2 = Account(20000);
        val a3 = Account(35000);
        val a4 = Account(-20000);
        val a5 = Account(-30000);

        var bank = new Bank(List(a1,a2,a3,a4,a5));

        println("\nNegative Balance Accounts "+bank.NegativeBalance())
        println("Total Balance "+bank.TotalBalance())
        println("\nAfter Interest")
        bank.ApplyInterest()
        println("\nNegative Balance Accounts "+bank.Accounts)
        println("Total Balance "+bank.TotalBalance())
    }
}