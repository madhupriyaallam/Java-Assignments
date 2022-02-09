package Madhu.Assignment.main;

import Madhu.Assignment.data.Assignment5;
import Madhu.Assignment.singleton.Singleton;

public class Main {
        public static void main(String[] args) {
            Assignment5 obj1 = new Assignment5();
            obj1.printGlobalVariables();
            obj1.localVariables();

            Singleton obj2 = Singleton.stringInitializer("Hello");
            System.out.println(obj2);
            obj2.print();
        }
    }

