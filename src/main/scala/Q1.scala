class Rational(numerator: Int, denominator: Int){
  require(denominator!=0,"Error,Denominator can't be 0");
  var rational:Double = numerator.toDouble/denominator.toDouble;
  def neg(): Unit = {
    var y = new Rational(-1*numerator,denominator);
    println("The negetive rational number is "+y.rational)
  }

}

object Q1 extends App{
  var x = new Rational(5,2)

  println("The rational number is "+x.rational);
  x.neg()

}