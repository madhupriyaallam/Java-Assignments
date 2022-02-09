package Java.Assignment9;
import java.util.Scanner;
import java.util.regex.Pattern;

class Regex {
    public boolean regexCheck(String sentence){
        boolean b = Pattern.matches("^[A-Z].*\\.$",sentence);   // ^ - start, $ - end, .* - multiple sequence of characters
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        Regex r = new Regex();
        System.out.println("Start with a capital letter and end with period? "+r.regexCheck(sentence));
    }
}