import java.util.Scanner;
public class maximumproductofsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr[i], min * arr[i]), arr[i]);
            min = Math.min(Math.min(temp * arr[i], min * arr[i]), arr[i]);
            if (max > result) {
                result = max;
            }
        }
        System.out.println("The maximum product of the subarray is: " + result);
        sc.close();
}}
