import java.util.*;
class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float X = sc.nextFloat();
        float Y = sc.nextFloat();
        float Z = sc.nextFloat();
        
        if (X > Y) {
            if (Y > Z) {
                System.out.println("Maximum number is " + X);
                System.out.println("Minimum number is " + Z);
            } else if (X > Z) {
                System.out.println("Maximum number is " + X);
                System.out.println("Minimum number is " + Y);
            } else {
                System.out.println("Maximum number is " + Z);
                System.out.println("Minimum number is " + Y);
            }
        } else if (Y > Z) {
            System.out.println("Maximum number is " + Y);
            System.out.println("Minimum number is " + X);
        } else {
            System.out.println("Maximum number is " + Z);
            System.out.println("Minimum number is " + X);
            
        }
    }
}
    
