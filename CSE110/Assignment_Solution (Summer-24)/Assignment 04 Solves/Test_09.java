import java.util.*;
class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (; n != 0;) {
            count++;
            n = n / 10;
        }
        System.out.println("Total digits = " + count);
    }
}
