import java.util.*;
class T6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String m = "";
        String o = "";

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == ' ') {
                o = m + " " + o;
                m = "";
            } else {
                m += c;
                if (i == n.length() - 1) {
                    o = m + " " + o;
                }
            }
        }
        System.out.println(o);
    }
}

