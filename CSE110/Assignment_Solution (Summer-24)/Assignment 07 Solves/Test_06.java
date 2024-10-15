import java.util.*;
class Task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int a = s.nextInt();
        float arr[] = new float[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter a number: ");
            arr[i] = s.nextFloat();
        }
        double max = arr[0];
        double min = arr[0];

        float sum = 0;
        int max_index = 0;
        int min_index = 0;
        for (int i = 0; i < a; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
        }

        System.out.println("Maximum element " + max + " found at index " + max_index);
        System.out.println("Minimum element " + min + " found at index " + min_index);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + (sum / a));
    }

}
