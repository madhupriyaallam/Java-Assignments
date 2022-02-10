package Java.Assignment8;

import java.util.Scanner;

class OutOfRangeException extends Exception{
    OutOfRangeException(String message){
        super(message);
    }
}

class NegativeIntegerException extends Exception{
    NegativeIntegerException(String message){
        super(message);
    }
}

class ZeroInputException extends Exception{
    ZeroInputException(String message){
        super(message);
    }
}


class ThrowMultipleExceptions{
    public void ThrowExceptions(int number) throws OutOfRangeException, NegativeIntegerException, ZeroInputException {
        if (number < 0)
            throw new NegativeIntegerException("Input cannot be negative");
        else if (number > 10)
            throw new OutOfRangeException("Input cannot exceed 10");
        else if (number == 0 )
            throw new ZeroInputException("Input cannot be zero");
    }
}

public class Assignment8 {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-10");

        try{
            number = input.nextInt();
            ThrowMultipleExceptions multiple = new ThrowMultipleExceptions();
            multiple.ThrowExceptions(number);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

