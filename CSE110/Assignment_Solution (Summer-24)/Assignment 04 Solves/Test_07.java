import java.util.Scanner;
class one {
    public static void main(String args[]) {
        int a = 10;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            System.out.print("Enter Number: ");
            int b = sc.nextInt();
            sum += b;
            System.out.println("Sum = " + sum);
        }

    }

}
