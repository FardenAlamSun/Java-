 import java.util.*;
    
    class one {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your ID : ");
            int ID = sc.nextInt();
            int x = (((ID / 10000) % 100) / 10);
            int y = ID / 1000000;
            if (x == 1) {
                System.out.print("Student Joined BRAC in Spring " + y);
            } else if (x == 2) {
                System.out.print("Student Joined BRAC in Fall " + y);
            } else if (x == 3) {
                System.out.print("Student Joined BRAC in Summer " + y);
            } else {
                System.out.print("Invalid ID");
            }
        }
        
    }
    
