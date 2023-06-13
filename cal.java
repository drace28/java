import java.util.Scanner;
class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b;
        char operator;
        System.out.print("Enter first number: ");
        a = scanner.nextFloat();
        System.out.print("Enter second number: ");
        b = scanner.nextFloat();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        scanner.close();

    }

}
