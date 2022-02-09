package Java.Assignment1;

public class ConversionFun {
    public static void main(String[] args)
    {
        //float myFloat = 1.4; narrowing/lossy conversion
        float myFloat = 1.4f;
        double myDouble = myFloat; // widening/lossless conversion
        System.out.println(myFloat+" "+myDouble);
    }
} 
