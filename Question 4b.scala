object main extends App{
    def attendence(price:Int):Int = 120 + (15-price)*20/5;
    def cost(price:Int):Int = 500 + (3*attendence(price));
    def revenue(price:Int):Int = price * attendence(price);
    def profit(price:Int):Int = revenue(price)-cost(price); 

    println("profit for ticket price of Rs.5    = "+profit(5));
    println("profit for ticket price of Rs.10   = "+profit(10));
    println("profit for ticket price of Rs.15   = "+profit(15));
    println("profit for ticket price of Rs.20   = "+profit(20));
    println("profit for ticket price of Rs.25   = "+profit(25));
    println("profit for ticket price of Rs.30   = "+profit(30));
}