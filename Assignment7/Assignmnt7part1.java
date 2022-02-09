package Java.Assignment7;
class Cycle{
    int wheels(){
        return 0;
    }
    void ride(){
        System.out.println("Cycle ride");
    }
}
class Unicycle extends Cycle{
    int wheels(){
        return 1;
    }
    void balance(){
        System.out.println("Unicycle balance");
    }

    @Override
    void ride() {
        System.out.println("Unicycle ride");
    }
}
class Bicycle extends Cycle{
    int wheels(){
        return 2;
    }
    void balance(){
        System.out.println("Bicycle balance");
    }

    @Override
    void ride() {
        System.out.println("Bicycle ride");
    }
}
class Tricycle extends Cycle{
    int wheels(){
        return 3;
    }

    @Override
    void ride() {
        System.out.println("Tricycle ride");
    }
}
class Assignment41 {
    public static void main(String[] args)
    {
        Cycle cycle[] = new Cycle[]{new Cycle(), new Unicycle(), new Bicycle(), new Tricycle()};
        for (Cycle c : cycle) {
            c.ride();
            System.out.println("wheels = " + c.wheels());
            //((Unicycle) c).balance();
        }//Java.Assignment7.Cycle cannot be cast to Java.Assignment7.Unicycle
    }
}
