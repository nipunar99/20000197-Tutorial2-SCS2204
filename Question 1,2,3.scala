import scala.compiletime.ops.float
object main extends App{

    println("PART 1");
    //part 1
    var i, j=2;
    var k: Float = 2;   //here I defined k as float because later in the 
    var m, n = 5;
    var f:Float = 12.0f;
    var g:Float = 4.0f;
    var c='X';

    println("(a) k + 12 * m ="  +  (k + 12*m));
    println("(b) m/j ="  +  (m/j));
    println("(c) n%j ="  +  (n%j));
    println("(d) m/j*j ="  +  (m/j*j));
    println("(e) f + 10*5 + g ="  +  (f + 10*5 + g));
    //println("(a) ++i*n"  +  (++i*n));

    println();
    println("PART 2");

    //part 2
    var a = 2;
    var b = 3;
    c = 4;
    var d = 5;
    k= 4.3;

    //println(--b*a+c*d--);
    //println(a++);
    println("(c) " + (-2*(g-k)+c));
    //println(c=c++);
    //println(c=++c*a++);

    /*these Commented codes cannotbe evaluated because in scala 
    incremental and decremental operations such as ++ and -- are 
    considered to be invalid. Only (c)can be evaluated*/


}