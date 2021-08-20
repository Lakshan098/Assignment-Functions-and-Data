object Q1{
    class Rational(x:Int , y:Int){
        private def gcd(a:Int , b:Int): Int =
            if(b==0) a else gcd(b, a%b)
            private val g = gcd(x,y)
        def numer = x / g;
        def denom = y / g;

        def neg(r:Rational) =
            new Rational (-r.numer, r.denom)

        override def toString = numer + "/" + denom;
    }

    def main(args:Array[String]){
        val x = new Rational(5 , 7);
        println(x.neg(x));
    }
}