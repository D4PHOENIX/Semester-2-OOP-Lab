// Assignment no. 3 Question no. 1, 2
import java.util.Scanner;

public class arraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Array = new int[20];
        System.out.println("Enter 20 values:");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextInt();
        }
        input.close();
        int[] copy = new int[20];
        for (int i = 0; i < Array.length; i++) {
            copy[i] = Array[i];
        }
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - i - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }
        }
        System.out.println("The values in ascending order are:");
        for (int num : Array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - i - 1; j++) {
                if (copy[j] < copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        System.out.println("The values in descending order are:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
