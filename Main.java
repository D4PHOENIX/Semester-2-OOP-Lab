// import java.util.*;
import java.util.Scanner;  // Import the Scanner class

class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = myObj.nextLine();
        System.out.println("Your Name is " + name + ".");
        myObj.close();
    }
}