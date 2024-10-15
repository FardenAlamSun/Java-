import java.util.*;
class one {
    public static void main(String args[]) {
        Scanner sun = new Scanner(System.in);
        int a = sun.nextInt();
        int i;
        for (i = 1; a / i >= 10;) {
            i *= 10;
        }
        for (; i > 0; i = i / 10) {
            int b = (a / i) % 10;
            if (i == 1) {
                System.out.println(b);
            } else {
                System.out.print(b + ", ");
            }
        }
    }
}
