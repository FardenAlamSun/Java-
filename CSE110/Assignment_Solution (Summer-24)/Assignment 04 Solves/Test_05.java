import java.util.*;
class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        int positive = 0;
        int negative = 0;
        for (int i = 1; i <= a; i++) {

            System.out.print("Enter number " + i + ": ");
            int b = sc.nextInt();

            if (b >= 0) {
                positive++;

            } else {
                negative++;

            }

        }
        System.out.println(positive + " Non-negative Numbers");
        System.out.println(negative + " Negative Numbers");

    }
}
