import java.util.*;
    
class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        if (X > Y && Y < Z) {
            System.out.print("This is a Scalene triangle");
        } else if (X == Y && Y > Z) {
            System.out.print("This is a Isosceles triangle");
        } else if (X == Y && Y == Z) {
            System.out.print("This is a Equilateral triangle");
        } else {
            System.out.print("Not Found");
        }
    }
    
}
