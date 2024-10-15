import java.util.*;
class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int sum = 0;
        float avg = 0;
        System.out.println("Input the " + N + " numbers:");

        for (int i = 1; i <= N; i++) {
            System.out.println(i);

            sum += i;
            avg = sum / N;

        }
        System.out.println("The sum of " + N + " no is: " + sum);
        System.out.print("The Average is: " + avg);

    }
}

