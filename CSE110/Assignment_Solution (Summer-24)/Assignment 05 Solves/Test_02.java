import java.util.*;

class Test02 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("The value of N: ");
        int N = s.nextInt();

        int y = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                sum = sum + j;

            }
            y = y - sum;
        }
        System.out.println("The value of y: " + y);

    }
}
