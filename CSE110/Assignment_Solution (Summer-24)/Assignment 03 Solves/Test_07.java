  import java.util.*;

    class one {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x < 0) {
                System.out.print("output: " + 2 * x);
            } else if (x >= 0 && x < 2) {
                System.out.print("output: " + ((x + 1)));
            } else if (x >= 2 && x < 5) {
                System.out.print("output: " + ((x * x) - 1));
            } else if (x >= 5) {
                System.out.print("output: " + ((3 * (x * x)) + 2));
                
            }
        }
    }

    
