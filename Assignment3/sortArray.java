// Assignment no. 3 Question no. 1, 2
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        // Creating Scanner object and taking input from user
        Scanner input = new Scanner(System.in);
        int[] inputArray = new int[20];
        System.out.println("Enter 20 values:");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.nextInt();
        }
        input.close();
        // Creating a copy of the original array
        int[] copyArray = new int[20];
        for (int i = 0; i < inputArray.length; i++) {
            copyArray[i] = inputArray[i];
        }
        // Sorting the original array in ascending order using bubble sort
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array in ascending order
        System.out.println("The values in ascending order are:");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Sorting the copy array in descending order using bubble sort
        for (int i = 0; i < copyArray.length - 1; i++) {
            for (int j = 0; j < copyArray.length - i - 1; j++) {
                if (copyArray[j] < copyArray[j + 1]) {
                    int temp = copyArray[j];
                    copyArray[j] = copyArray[j + 1];
                    copyArray[j + 1] = temp;
                }
            }
        }
        System.out.println("The values in descending order are:");
        // Printing the sorted array in descending order
        for (int num : copyArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Finding the minimum and maximum values in the original array
        int minValue = inputArray[0];
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        // Printing Maximum and Minimum values
        System.out.println("The minimum value is " + minValue);
        System.out.println("The maximum value is " + maxValue);
    }
}
