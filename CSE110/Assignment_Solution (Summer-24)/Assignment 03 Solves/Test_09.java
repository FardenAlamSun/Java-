   import java.util.*;

    class one {
        public static void main(String args[]) {
            Scanner sun = new Scanner(System.in);
            int paid = sun.nextInt();
            int age = sun.nextInt();
            int tax = 0;
            
            if (age >= 18) {
                if (paid < 10000) {
                    tax = 0;
                } 
                else if (paid <= 20000) {
                    tax = (int) (paid * 0.05f);
                }
                else if (paid > 20000) {
                    tax = (int) (paid * 0.10f);
                }
                System.out.print("Your tax amounts in " + tax + " Tk");
            }
        }
    }
