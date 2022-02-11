package Java.LambdasAndStreams;
public class CreatingLambdas {

    interface Greeting{
        public String sayHello(String g);
    }

    public void testGreeting(String a, Greeting g){
        String result = g.sayHello(a);

        System.out.println("Result: "+result);
    }

    public static void main(String[] args) {
        // input -> body
        // (String s) -> "Hello, "+s;
        new CreatingLambdas().testGreeting("Santosh", (String s) -> "Hello, "+s);

        // (String p) -> p.isEmpty()? "Did you miss something?" : "Howdy, "+p
        new CreatingLambdas().testGreeting("",
                (String p) -> p.isEmpty()? "Did you miss something?" : "Howdy, "+p);
    }

}
