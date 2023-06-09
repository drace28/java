import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();
        int middledigit = number/10 % 10;
        if(length==2){
            if(middledigit%3==0){
                System.out.println("It is a trendy number");
            }
            else{

                System.out.println("not a trendy number");
            }
        }
        else{System.out.println("enter correct number");}
        scanner.close();
    }
}
