package Java.Assignment1;

import java.util.Scanner;

public class MidLibsClone {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;
        System.out.println("Enter adjective");
        adjective1 = keyboard.nextLine();
        System.out.println("Enter girl's name");
        girlsName = keyboard.nextLine();
        keyboard.nextLine();
        System.out.println("Enter another adjective");
        adjective2 = keyboard.nextLine();
        System.out.println("Enter occupation");
        occupation1 = keyboard.nextLine();
        System.out.println("Enter the name of a place");
        placeName = keyboard.nextLine();
        System.out.println("Enter the name of a piece of clothing");
        clothing = keyboard.nextLine();
        System.out.println("Enter the name of a hobby");
        hobby = keyboard.nextLine();
        System.out.println("Enter another adjective");
        adjective3 = keyboard.nextLine();
        System.out.println("Enter another occupation");
        occupation2 = keyboard.nextLine();
        System.out.println("Enter the name of a boy");
        boysName = keyboard.nextLine();
        System.out.println("Enter the name of a man");
        mansName = keyboard.nextLine();
        System.out.println("Once there was a "+adjective1+" girl named "+girlsName+" who was a "+adjective2+" "+occupation1+" in the kingdom of "+placeName+".");
        System.out.println("She loved to wear "+clothing+" and to "+hobby+". She wanted to marry "+adjective3+" "+occupation2+" named "+boysName+" but her father, King "+mansName+" forbid her from seeing him.");
    }
}
