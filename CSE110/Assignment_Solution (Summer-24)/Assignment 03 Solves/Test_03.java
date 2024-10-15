import java.util.*;

class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        char d = c.charAt(0);
        int e = 0;
        
        if (d == '+') {
            e = (a + b);
        } else if (d == '-') {
            e = (a - b);
        } else if (d == '*') {
            e = (a * b);
        } else if (d == '/') {
            if (b != 0)
                e = (a / b);
            else {
                System.out.print("Can't divide by Zero");
            }
        } else {
            System.out.print("Invalid operator");
        }
        System.out.print(e);
    }
}
