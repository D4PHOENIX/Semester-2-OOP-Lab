package objects;
import java.util.Scanner;

public class Factorial{
    static int factor(int i){
        if (i == 0 || i == 1) {
            return 1;
        } 
        else {
            return i * factor(i - 1);
        }
}
    public static void main(String[] args){
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER FOR FACTORIAL:");
        input = sc.nextInt();
        sc.close();
        long factorial = factor(input);
        System.out.println("Factorial: " + factorial);
    }
}