package Java.Assignment6;

public class ObjectArray2 {
    String name;
    ObjectArray2(String name){
        this.name = name;
        System.out.println("Name is : "+name);
    }
    public static void main(String[] args){
        ObjectArray2 obj[] = new ObjectArray2[3];
        obj[0] = new ObjectArray2("Madhu");
        obj[1] = new ObjectArray2("Bhargava");
        obj[2] = new ObjectArray2("Sai");
    }
}
