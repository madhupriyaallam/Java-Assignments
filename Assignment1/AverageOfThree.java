package Java.Assignment1;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args)
    {
        Scanner avg = new Scanner(System.in);
        double num1,num2,num3,average;
        System.out.println("Enter three numbers");
        num1 = avg.nextDouble();
        num2 = avg.nextDouble();
        num3 = avg.nextDouble();
        average = (num1+num2+num3)/3;
        System.out.println("Average of three numbers is "+average);
    }
}
