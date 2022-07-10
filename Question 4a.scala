object main extends App{
    def normalHourSalary(h :Int):Int =250*h;
    def OTsalary(h :Int):Int = h*85;
    def totaSalary(nh :Int, oth: Int):Int = normalHourSalary(nh) + OTsalary(oth);  //nh: normal hours | oth: OT hours
    def taxAmount(nh :Int, oth: Int) = totaSalary(nh,oth)*12/100.toFloat;
    def takeHomeSalary(nh :Int,oth :Int):Float = totaSalary(nh,oth)-taxAmount(nh,oth);

    println("Take Home Salary of a typical employee: " + takeHomeSalary(40,30));
}