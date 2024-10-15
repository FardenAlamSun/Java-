  import java.util.*;

    class one {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 0) {
                System.out.print("Number is negative");
            } else if (n == 0) {
                System.out.print("Number is zero");
            } else if (n > 0) {
                if (n % 2 == 0) {
                    System.out.print("Number is positive and even");
                } else {
                    System.out.print("Number is positive and odd");
                }
            }
        }
    }
