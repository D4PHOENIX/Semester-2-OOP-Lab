// import java.util.*;
import java.util.Scanner;  // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scan.nextInt();
        System.out.println("Enter function to perform: ");
        char function = scan.next().charAt(0);  
        scan.close();
        
        int result = switch (function) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '/' -> firstNum / secondNum;
            case '*' -> firstNum * secondNum;
            default -> 0;
        };

        System.out.println("The result is " + result);
    }
}