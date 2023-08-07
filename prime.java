import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lower number: ");
        int n = scan.nextInt();
        System.out.println("Enter the upper number: ");
        int m = scan.nextInt();
        System.out.println("Prime numbers between " + n + " and " + m + " are: ");
        for (int i = n; i <= m; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            scan.close();
        }
    }
}
