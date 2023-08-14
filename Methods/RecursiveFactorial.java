import java.util.Scanner;
public class RecursiveFactorial {
    public static long factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        long factorial = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}