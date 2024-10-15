
import java.util.*;
class T9{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        int count = 0;
        int UpperCase = 0;
        int LowerCase = 0;
        int Digits = 0;
        int SpecialChar = 0;
        for (int i = 0; i < n.length(); i++) {
            int m = n.codePointAt(i);
            if (m >= 65 && m <= 90) {
                UpperCase++;
                count++;

            } else if (m >= 97 && m <= 122) {
                LowerCase++;
                count++;
            } else if (m >= 48 && m <= 57) {
                Digits++;
                count++;
            } else {
                SpecialChar++;
                count++;
            }
        }
        if (count >= 8 && UpperCase >= 1 && LowerCase >= 1 && Digits >= 1 && SpecialChar >= 1) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }

    }
}
