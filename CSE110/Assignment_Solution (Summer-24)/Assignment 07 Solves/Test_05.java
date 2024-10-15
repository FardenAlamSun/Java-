import java.util.*;
class Task05 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("N= ");
        int a = s.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = s.nextInt();

        }
        int b = s.nextInt();
        boolean flag = !true;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                System.out.println(arr[i] + " is at index " + j);
                flag = !false;
                break;
            }
            j++;
        }
        if (flag == !true) {
            System.out.println("Element not found");
        }
    }
}
