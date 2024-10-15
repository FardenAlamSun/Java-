import java.util.*;
class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double n = 0;

        for (int i = 1;; i++) {

            System.out.print("Enter Number: ");
            int x = sc.nextInt();
            if (x > 0) {

                n = Math.pow(x, 2);

                System.out.println(x + " ^ 2 = " + (int) n);
            } else {
                System.out.print("");
                break;
            }

        }

    }
}
