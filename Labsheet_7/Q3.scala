var bank: List[Account] = List();

class Account(id: String, n: Int, b: Double) {
    val nic: String = id;
    val acnumber: Int = n;
    var balance: Double = b;

    def transfer(a: Account,d: Double): Account = {
      this.balance = this.balance - d;
      a.balance = a.balance + d;
      a;
    }

    override def toString(): String = "[ NIC  no - " + nic + " : Account No - " + acnumber + " : Balance - " + balance + "]";
}

object Q3 {
  def main(args: Array[String]) = {
    var a1 = Account("199913202841", 1111, 50000.00);
    var a2 = Account("199913215433", 1112, 30000.00);

    //a1 transfer 3000 to a2
    a1.transfer(a2,3000.0);

    bank = List(a1,a2);

    var itr = bank.iterator;

    while(itr.hasNext) 
      println(itr.next);
  }
}
