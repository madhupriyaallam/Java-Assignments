package Java.Assignment7;
//Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
interface Cycle1 {
    void ride();
}

interface CycleFactory {
    Cycle1 getCycle();
}

class Unicycle1 implements Cycle1 {
    public void ride() {
        System.out.println("Ride Unicycle");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle1 getCycle() {
        return new Unicycle1();
    }
}

class Bicycle1 implements Cycle1 {
    public void ride() {
        System.out.println("Ride Unicycle");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle1 getCycle() {
        return new Bicycle1();
    }
}


class Tricycle1 implements Cycle1 {
    Tricycle1() { System.out.println("Tricycle1()"); }
    public void ride() { System.out.println("Ride Tricycle"); }
}

class TricycleFactory implements CycleFactory {
    public Cycle1 getCycle() {
        return new Tricycle1();
    }
}

public class CycleFactories {
    public static void rideCycle(CycleFactory factory) {
        Cycle1 c = factory.getCycle();
        c.ride();
    }
    public static void main(String [] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}

