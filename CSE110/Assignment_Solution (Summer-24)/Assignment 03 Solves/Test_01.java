import java.util.*;

class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && b > c) {
            System.out.print("largest number: " + a);
        } 
        else if (a < b && b > c) {
            System.out.print("largest number: " + b);
        } 
        else {
            System.out.print("largest number: " + c);
        }

    }
}
