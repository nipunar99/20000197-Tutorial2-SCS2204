object main extends App{
    def attendees(price:Int):Int=120+(15-price)/5*20;
    def attendees(price:Int):Int=120+(15-price)/5*20;
    def cost(price:Int):Int=500+attendees(price);
    def profit(price:Int):Int = revenue(price)- cost(price);

    println("Ticket price:  5   10  25  20");
    println("Est Profit:    "+profit(5)+"   "+profit(10)+"  "+profit(15)+"  "+profit(20));
}