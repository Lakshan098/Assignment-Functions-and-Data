object Q2{
    class Rational(x:Int , y:Int){
        private def gcd(a:Int , b:Int): Int =
            if(b==0) a else gcd(b, a%b)
            private val g = gcd(x,y)
        def numer = x / g;
        def denom = y / g;

        def sub(r:Rational) = 
            new Rational (numer*r.denom - r.numer*denom , denom*r.denom)

        override def toString = numer + "/" + denom
    }
    def main(args:Array[String]){
        val x = new Rational(7,2);
        val y = new Rational(5,6);
        val z = new Rational(8,5);
        println(x.sub(y).sub(z));
    }
}