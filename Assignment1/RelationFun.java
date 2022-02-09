package Java.Assignment1;

public class RelationFun {
    public static void main(String[] args)
    {
        int myAge = 21;
        int yourAge = 22;
        boolean ageComparision = myAge > yourAge;
        System.out.println("myAge > yourAge?: "+ageComparision);
        ageComparision = yourAge > myAge;
        System.out.println("yourAge > myAge?: "+ageComparision);
        ageComparision = yourAge == myAge;
        System.out.println("yourAge == myAge?: "+ageComparision);
    }
}

