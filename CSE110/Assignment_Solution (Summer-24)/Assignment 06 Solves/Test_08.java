import java.util.*;
class T8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            int ascii_n1 = (int) a;
            if (i == 0) {
                if (ascii_n1 >= 65 && ascii_n1 <= 90) {
                    int ascii_n1_new = ascii_n1 + 32;
                    char b = (char) ascii_n1_new;
                    count++;
                    System.out.print(b);

                } else {
                    char c = (char) ascii_n1;
                    count++;
                    System.out.print(c);
                }

            } else if (count > 0 && count % 2 != 0) {
                if (ascii_n1 >= 97 && ascii_n1 <= 122) {
                    int ascii_n1_new = ascii_n1 - 32;
                    char b = (char) ascii_n1_new;
                    count++;
                    System.out.print(b);
                } else if (ascii_n1 >= 32 && ascii_n1 <= 47) {
                    char c = (char) ascii_n1;
                    System.out.print(c);
                } else {
                    char d = (char) ascii_n1;
                    count++;
                    System.out.print(d);
                }
            } else if (count > 0 && count % 2 == 0) {
                if (ascii_n1 >= 65 && ascii_n1 <= 90) {
                    int ascii_n1_new = ascii_n1 + 32;
                    char b = (char) ascii_n1_new;
                    count++;
                    System.out.print(b);

                } else if (ascii_n1 >= 32 && ascii_n1 <= 47) {
                    char c = (char) ascii_n1;
                    System.out.print(c);
                } else {
                    char d = (char) ascii_n1;
                    count++;
                    System.out.print(d);

                }
            } else {
                char b = (char) ascii_n1;
                count++;
                System.out.print(b);
            }
        }
    }
}

