package Java.Assignment1;
import java.util.*;
public class KeyboardInput {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        double realNumber;
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        keyboard.nextLine();
        System.out.println("Hello "+name);
        System.out.println("What's your real number?");
        realNumber = keyboard.nextDouble();
        keyboard.nextLine();
        realNumber *= 2;
        System.out.println("Double of number is "+realNumber);
        System.out.println("what city do you live in?");
        city = keyboard.nextLine();
        System.out.println("City is "+city);
    }
}

