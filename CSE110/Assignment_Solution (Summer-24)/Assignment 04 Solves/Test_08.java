import java.util.*;
class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0;; i++) {
            if (i % 5 == 0) {
                if (i % 3 != 0) {
                    System.out.println(i);

                }
                if (i == n) {
                    break;
                }
            }

        }
    }

}
