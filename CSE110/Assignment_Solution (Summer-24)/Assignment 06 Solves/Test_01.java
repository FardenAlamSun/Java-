import java.util.*;
class T1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        for (int i = 0; i < n.length(); i++) {
            char a = n.charAt(i);
            int ascii = (int) a;
            if (ascii >= 97 && ascii <= 122) {
                System.out.print((char) (ascii - 32));
            } else {
                System.out.print(a);
            }
        }
    }
}

