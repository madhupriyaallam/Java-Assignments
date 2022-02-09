package Java.Assignment2;
import java.lang.*;
import java.util.HashMap;
import java.util.Scanner;
 
public class Assignment2 { 
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any string");
        String input = keyboard.nextLine();
        /*int count = 0;  
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);    
            if('a' <= ch && ch <= 'z')
            {
                ch = Character.toUpperCase(ch);
            }
            if(!hm.containsKey(ch))
            {
                hm.put(ch,1);
                count++;
            }
        }
        if(count == 26)
        {
            System.out.println("Given input string contain all alphabets");
        }
        else
        {
            System.out.println("Given input string doesn't contain all alphabets");
        }
        */
        int index = 0;

        int flag = 1;
        boolean[] contains = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            } else if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }
            contains[index] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (contains[i]) {
                continue;
            }
            else
            {
                flag = 0;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Given input string doesn't contain all alphabets");
        }
        else {
            System.out.println("Given input string contain all alphabets");
        }
    }
}
