package Loops;
import java.util.Random;
import java.util.Scanner;


public class RandomNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        int userNum;
        int count = 0;
        System.out.println("Guess the number between 1 and 100: ");
        userNum = input.nextInt();
        while(userNum != randomNum){
            if(userNum > randomNum){
                System.out.println("Your guess is too high!");
            }
            else{
                System.out.println("Your guess is too low!");
            }
            System.out.println("Guess the number between 1 and 100: ");
            userNum = input.nextInt();
            count++;
        }
        System.out.println("You guessed the number correctly!");
        System.out.println("You took " + count + " guesses to guess the number correctly!");
        input.close();
    }
}