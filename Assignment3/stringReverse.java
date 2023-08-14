// Assignment no. 3, Question no. 3
import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args){
        // Creating Scanner object and taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = input.nextLine();
        input.close();
        // Reversing the string
        String outputString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            outputString += inputString.charAt(i);
        }
        System.out.println(outputString);
    }
}
