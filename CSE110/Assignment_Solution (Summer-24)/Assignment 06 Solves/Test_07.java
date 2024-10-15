import java.util.*;
class T7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine().toUpperCase();
        String b = s.nextLine().toUpperCase();
        String space = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int count = -1;
            for (int j = 0; j < b.length(); j++) {
                if (ch == b.charAt(j)) {
                    count = j;

                }

            }
            if (count == -1) {
                space += ch;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            int count = -1;
            for (int j = 0; j < a.length(); j++) {
                if (ch == a.charAt(j)) {
                    count = j;
                }
            }
            if (count == -1) {
                space += ch;
            }

        }
        System.out.print(space);
    }
}
