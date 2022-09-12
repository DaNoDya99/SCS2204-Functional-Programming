class Rational(x: Int, y: Int){
    def numer = x;
    def denom = y;

    def +(r:Rational) = new Rational(this.numer*r.denom + r.numer*this.denom, this.denom*r.denom);

    def neg = new Rational(-this.numer,this.denom);

    def -(r:Rational) = this + r.neg;

    override def toString = numer + "/"  + denom;
}

object Q2 {
  def main(args: Array[String]) = {
    val x = Rational(3,4);
    val y = Rational(5,8);
    val z = Rational(2,7);

    println(x - y - z);
  }
}
