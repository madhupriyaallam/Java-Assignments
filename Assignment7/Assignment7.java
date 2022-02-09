package Java.Assignment7;
class Rodent{
    void run(){
        System.out.println("Rodent is running");
    }
    void eat(){
        System.out.println("Rodent is eating");
    }
}
class Mouse extends Rodent{
    Mouse(){
        System.out.println("I'm a Mouse");
    }
    @Override
    void run() {
        System.out.println("I'm is running");
    }

    @Override
    void eat() {
        System.out.println("I'm is eating");
    }
}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("I'm a Gerbil");
    }
    @Override
    void run() {
        System.out.println("I'm is running");
    }

    @Override
    void eat() {
        System.out.println("I'm is eating");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("I'm a Hamster");
    }
    @Override
    void run() {
        System.out.println("I'm is running");
    }

    @Override
    void eat() {
        System.out.println("I'm is eating");
    }
}
class Assignment7 {
    public static void main(String[] args)
    {
        Rodent r[] = new Rodent[3];
        r[0] = new Mouse();
        r[0].eat();
        r[0].run();
        r[1] = new Gerbil();
        r[1].eat();
        r[1].run();
        r[2] = new Hamster();
        r[2].eat();
        r[2].run();
    }
}
