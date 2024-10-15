import java.util.*;

class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.print("Your grade is A");
        } 
        else if (n >= 85 && n <= 89) {
            System.out.print("Your grade is A-");
        } 
        else if (n >= 70 && n <= 84) {
            System.out.print("Your grade is B");
        } 
        else if (n >= 57 && n <= 69) {
            System.out.print("Your grade is C");
        } 
        else if (n >= 50 && n <= 56) {
            System.out.print("Your grade is D");
        } 
        else if (n < 50 && n >= 0) {
            System.out.print("Your grade is F");
        } 
        else {
            System.out.print("Wrong number");
        }
    }
}
