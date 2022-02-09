package Java.Assignment7;
interface Car{
    void running();
    void stop();
}
interface Flight{
    void land();
    void flying();
}
interface Ship{
    void conning();
    void port();
}
interface Mode extends Car,Flight,Ship{
    @Override
    void running();
    @Override
    void stop();
    @Override
    void flying();
    @Override
    void land();
    @Override
    void conning();
    @Override
    void port();
    public void printMode();
      //  System.out.println("Transportation modes");
}
class Booking{
    void status(){
        System.out.println("Online bookings are started");
    }
}
class Assignment7part2{
    Booking method1(Car car){
        return new Booking();
    }
    Booking method2(Flight flight){
        return new Booking();
    }
    void method3(Ship ship){

    }
    void method4(Mode mode){

    }
    public static void main(String[] args)
    {
        Assignment7part2 obj1 = new Assignment7part2();
        //obj1.method1();
    }
}
