//Task--03(b)==================================================>

import java.util.*;
class Task03_b {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int a = s.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            int b = s.nextInt();
            arr[i] = b;
        }
        System.out.println("Reversed using a new array: ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        for (int j = 0; j < a / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[a - 1 - j];
            arr[a - 1 - j] = temp;
        }
        System.out.println();
        System.out.println("Reversed the original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

