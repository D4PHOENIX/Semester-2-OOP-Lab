package Methods;
import java.util.Scanner;

public class factorial{
    static int factorialCalculator(int x){
        if (x == 0 || x == 1) {
            return 1;
        } 
        else {
            return x * factorialCalculator(x - 1);
        }
}
    public static void main(String[] args){
        int Input_Num, factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        Input_Num = input.nextInt();
        input.close();
        System.out.println("The Factorial of " + Input_Num + " is " + factorialCalculator(Input_Num) + ".");
    }
}