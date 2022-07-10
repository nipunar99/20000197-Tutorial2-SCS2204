object main extends App{
    def normalHourSalary(h :Int):Int =250*h;
    def OTsalary(h :Int):Int = h*85;
    def totaSalary(nh :Int, oth: Int):Int = normalHourSalary(nh) + OTsalary(oth);  //nh: normal hours | oth: OT hours
    def taxAmount(nh :Int, oth: Int):Float = totaSalary(nh,oth)*12/100;
    def takeHomeSalary(nh :Int,oth :Int):Float = totaSalary(nh,oth)-taxAmount(nh,oth);

    println(takeHomeSalary(40,30));
}