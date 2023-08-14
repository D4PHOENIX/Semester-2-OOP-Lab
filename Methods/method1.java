package Methods;

import java.util.Scanner;
import Methods.method2;

class Cal{
    public int addition(int x, int y){
        int z = x + y;
        return z;
    }
    public int addition(int x, int y, int z){
        int t = x + y + z;
        return t;
    }
}
public class method1 {
    public static void main(String[] args) {
        method2 method = new method2();
        Cal add = new Cal();
        int inputNum1, inputNum2, inputNum3, result1, result2;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Enter first Number: "); 
            inputNum1 = input.nextInt();
            // System.out.println("Enter second Number: ");
            // inputNum2 = input.nextInt();
            // System.out.println("Enter second Number: ");
            // inputNum3 = input.nextInt();
            // result1 = add.addition(inputNum1,inputNum2);
            // result2 = add.addition(inputNum1, inputNum2, inputNum3);
            // System.out.println(inputNum1 + "+" + inputNum2 + "=" + result1);
            // System.out.println(inputNum1 + "+" + inputNum2 + "+" + inputNum3 + "=" + result2);
            method.factorial(inputNum1);
        }
        input.close();

    }
}

