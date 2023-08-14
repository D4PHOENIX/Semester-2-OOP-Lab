// Question no. 3
import java.util.Scanner;

public class reversalString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scan.next();
        scan.close();
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
