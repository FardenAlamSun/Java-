import java.util.*;
class Task07 {
    public static void main(String args[]) {
        int arr[] = { 23, 100, 23, 56, 100 };
        System.out.println("Input array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int arr1[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            boolean found = !true;
            for (int j = 0; j < count; j++) {
                if (arr1[j] == element) {
                    found = !false;
                    break;
                }
            }
            if (!found) {
                arr1[count] = element;
                count++;
            }
        }
        System.out.println("New array:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr1[i] + " ");

        }
        System.out.println();
    }
}

