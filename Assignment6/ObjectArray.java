package Java.Assignment6;

public class ObjectArray {
    String name;
    ObjectArray(String name){
        this.name = name;
        System.out.println("Name is : "+name);
    }
    public static void main(String[] args){
        ObjectArray obj[] = new ObjectArray[]{new ObjectArray("Madhu"),new ObjectArray("Bhargava"),new ObjectArray("Sai")};
    }
}
