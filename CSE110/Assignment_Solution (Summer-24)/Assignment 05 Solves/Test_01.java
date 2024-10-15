import java.util.*;

class Test01 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int number = 2;
        int primeCount = 0;
        for (; primeCount < N; number++) {

            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);
                primeCount++;
            }

        }
    }
}
