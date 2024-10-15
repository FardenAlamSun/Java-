import java.util.*;
class T2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        if (n.equalsIgnoreCase(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
