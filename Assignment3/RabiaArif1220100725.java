// Assignment no. 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Question no. 1
        Scanner input = new Scanner(System.in);
        int[] userArray = new int[20];
        System.out.println("Enter 20 values:");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = input.nextInt();
        }
        input.close();
        int[] copiedArray = new int[20];
        for (int i = 0; i < userArray.length; i++) {
            copiedArray[i] = userArray[i];
        }
        for (int i = 0; i < userArray.length - 1; i++) {
            for (int j = 0; j < userArray.length - i - 1; j++) {
                if (userArray[j] > userArray[j + 1]) {
                    int temp = userArray[j];
                    userArray[j] = userArray[j + 1];
                    userArray[j + 1] = temp;
                }
            }
        }
        System.out.println("The values in ascending order are:");
        for (int num : userArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < copiedArray.length - 1; i++) {
            for (int j = 0; j < copiedArray.length - i - 1; j++) {
                if (copiedArray[j] < copiedArray[j + 1]) {
                    int temp = copiedArray[j];
                    copiedArray[j] = copiedArray[j + 1];
                    copiedArray[j + 1] = temp;
                }
            }
        }
        System.out.println("The values in descending order are:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Question no. 2
        int minVal = userArray[0];
        int maxVal = userArray[0];
        for (int i = 1; i < userArray.length; i++) {
            if (userArray[i] < minVal) {
                minVal = userArray[i];
            }
            if (userArray[i] > maxVal) {
                maxVal = userArray[i];
            }
        }
        System.out.println("The minimum value is " + minVal);
        System.out.println("The maximum value is " + maxVal);
        System.out.println();
        
        // Question no. 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userString = scan.next();
        scan.close();
        String reversedString = "";
        for (int i = userString.length() - 1; i >= 0; i--) {
            reversedString += userString.charAt(i);
        }
        System.out.println("The reversed string is " + reversedString);

    }
}
