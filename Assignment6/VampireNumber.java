package Java.Assignment6;
import java.util.Arrays;
public class VampireNumber {
        public static void main(String[] args) {
            final int START = 10, END = 10000;
            int count = 0;
            for (int num = START; num < END; num++) {
                String sNum = String.valueOf(num);
                boolean trailingZeros = sNum.endsWith("0");
                int max = (int) Math.min(END, Math.pow(10, sNum.length()));

                for (long num1 = num; num1 < max; num1++) {

                    long candidate = num * num1;
                    if (candidate % 9 == (num + num1) % 9) {

                        String sCandidate = String.valueOf(candidate);
                        String sFangB = String.valueOf(num1);

                        if ((trailingZeros && sFangB.endsWith("0")) == false) {

                            char[] cVampire = sCandidate.toCharArray();
                            Arrays.sort(cVampire);

                            char[] cFangs = (sNum + sFangB).toCharArray();
                            Arrays.sort(cFangs);

                            if (Arrays.equals(cVampire, cFangs) && count <= 100) {
                                System.out.println(sNum + " * " + sFangB + " = " + sCandidate);
                                count++;
                            }
                        }
                    }
                }
            }
        }
}
