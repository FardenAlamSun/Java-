
import java.util.*;
class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        int a = sc.nextInt();
        int sum = 0;
        int count = 0;

        System.out.println("The odd numbers are: ");
        for (int i = 1;; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            if (count == a) {
                break;

            }

        }
        System.out.print("The Sum of odd Natural Numbers up to " + a + " terms is: " + sum);

    }
}

