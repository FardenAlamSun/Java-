import java.util.*;
class Task2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int a = s.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            int b = s.nextInt();
            arr[i] = b;
        }
        System.out.println("Before removing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println("\nAfter removing duplicates with 0: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

