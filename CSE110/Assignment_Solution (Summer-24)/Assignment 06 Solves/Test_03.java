import java.util.Scanner;

class T3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        char m = s.next().charAt(0);
        String temp = "";
        for (int i = 0; i <= n.length() - 1; i++) {
            char o = n.charAt(i);
            if (o == m) {
                System.out.println(temp);
            } else {
                System.out.print(o);
            }
        }
    }
}

