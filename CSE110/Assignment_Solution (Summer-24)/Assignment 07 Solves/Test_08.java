import java.util.*;
class Task08 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int a = s.nextInt();
        int arr1[] = new int[a];
        System.out.println("Please enter the elements of the arr1:");
        for (int i = 0; i < a; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.print("Please enter the length of array 2: ");
        int b = s.nextInt();
        int arr2[] = new int[b];
        System.out.println("Please enter the elements of the arr2:");
        for (int i = 0; i < b; i++) {
            arr2[i] = s.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < b; i++) {
            boolean found = false;
            for (int j = 0; j < a; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }

    }

}

