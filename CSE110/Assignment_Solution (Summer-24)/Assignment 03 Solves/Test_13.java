import java.util.*;
    class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int x = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int y = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int z = sc.nextInt();
        
        if (x == y && y == z) {
            System.out.print("All numbers are equals");
        } else if (x != y && y != z) {
            System.out.print("All numbers are different");
        } else {
            System.out.print("Neither all are equal or different");
        }
        
    }
}
