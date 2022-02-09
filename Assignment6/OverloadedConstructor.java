package Java.Assignment6;
public class OverloadedConstructor {
    OverloadedConstructor(){
        System.out.println("Example of construction overloading");
    }
    OverloadedConstructor(int a){
        OverloadedConstructor ob = new OverloadedConstructor();
        System.out.println("Assignment "+a+" ,calling default constructor in a parameterised one");
    }
    public static void main(String[] args){
        OverloadedConstructor obj = new OverloadedConstructor(6);
    }
}
