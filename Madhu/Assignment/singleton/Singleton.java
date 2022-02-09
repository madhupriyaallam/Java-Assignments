package Java.Madhu.Assignment.singleton;

public class Singleton {
        String stringReference;

        public static Singleton stringInitializer(String stringInput){
//        stringReference = stringInput;
            return new Singleton();
        }

        public void print(){
            System.out.println("Global string: "+stringReference);
        }
    }
