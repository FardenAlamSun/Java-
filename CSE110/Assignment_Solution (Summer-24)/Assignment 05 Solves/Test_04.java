import java.util.*;

class sun {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N= ");
        int N = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < y; i++) {
            if (x % 2 == 0) {
                x++;
            }
            if (x % 2 != 0) {
                sum += x;
                x++;
            }
        }
        System.out.print("sum=" + sum);

    }
}
