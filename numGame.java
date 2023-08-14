// package com.company;
import java.util.Scanner;

public class numGame{
    
    int inputNum;
    int computerNum;
    
    void userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        inputNum = input.nextInt();
        input.close();
    }
    void computerInput(){
        computerNum = (int)(Math.random()*3);
    }
    void compare(){
        if(inputNum == computerNum){
            System.out.println("It's a tie!");
        }
        else if(inputNum == 0 && computerNum == 1){
            System.out.println("You win!");
        }
        else if(inputNum == 0 && computerNum == 2){
            System.out.println("You lose!");
        }
        else if(inputNum == 1 && computerNum == 0){
            System.out.println("You lose!");
        }
        else if(inputNum == 1 && computerNum == 2){
            System.out.println("You win!");
        }
        else if(inputNum == 2 && computerNum == 0){
            System.out.println("You win!");
        }
        else if(inputNum == 2 && computerNum == 1){
            System.out.println("You lose!");
        }
    }
    public void Main(String[] args){
        userInput();
        computerInput();
        compare();
    }
}