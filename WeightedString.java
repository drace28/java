import java.util.Scanner;
class WeightedString{

    public static int weightOfString(String string, int ignore) {

        if(string == null || string.isEmpty()) {
            return 0;
        }

        string = string.toLowerCase();

        int weight = 0;
        
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (ignore == 0) {
                if (letter == 'a' || letter == 'e' || letter == 'i' 
                    || letter == 'o' || letter == 'u') {
                    continue;
                }
            }
            if (letter >= 97 && letter <= 122) {
                weight += letter - 96;
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.nextLine();
        System.out.print("Do you want to ignore vowels? (0 for no, 1 for yes): ");
        int ignore = sc.nextInt();
        System.out.println("Weight of string = " + weightOfString(string, ignore));
        sc.close();
    }

}
