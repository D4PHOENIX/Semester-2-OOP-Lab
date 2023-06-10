import java.util.Scanner;

public class result{
    public static void main(String[] args){
        // Defining variables
        String userName, Button;
        int regNo;
        int phyMarks, mathMarks, engMarks, PFMarks, ICTMarks;
        int totalMarks = 500, obtainedMarks;
        float percentage;
        char grade;
        // Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        userName = input.nextLine();
        System.out.println("Enter your registration number: ");
        regNo = input.nextInt();
        System.out.println("Enter your marks in Physics: ");
        phyMarks = input.nextInt();
        System.out.println("Enter your marks in Mathematics: ");
        mathMarks = input.nextInt();
        System.out.println("Enter your marks in English: ");
        engMarks = input.nextInt();
        System.out.println("Enter your marks in PF: ");
        PFMarks = input.nextInt();
        System.out.println("Enter your marks in ICT: ");
        ICTMarks = input.nextInt();
        input.close();
        // Calculating percentage and grade
        obtainedMarks = phyMarks + mathMarks + engMarks + PFMarks + ICTMarks;
        percentage = ((float)obtainedMarks*100)/(float)totalMarks;
        if(percentage >= 90){
            grade = 'A';
        }
        else if(percentage >= 80 && percentage < 90){
            grade = 'B';
        }
        else if(percentage >= 70 && percentage < 80){
            grade = 'C';
        }
        else if(percentage >= 60 && percentage < 70){
            grade = 'D';
        }
        else if(percentage>= 50 && percentage < 60){
            grade = 'E';
        }
        else{
            grade = 'F';
        }
        // Defining Coloured Button
        switch(grade){
            case 'F':
                Button = "\u001B[41m \u001B[30m You have failed the exam \u001B[0m";
                break;
            default:
                Button = "\u001B[42m \u001B[30m You have passed the exam \u001B[0m";
                break;      
        }
        // Printing the result
        System.out.println("\n\n---------Result Card---------");
        System.out.println("Name: " + userName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("------------------------------");
        System.out.println("Marks in Physics: " + phyMarks);
        System.out.println("Marks in Mathematics: " + mathMarks);
        System.out.println("Marks in English: " + engMarks);
        System.out.println("Marks in PF: " + PFMarks);
        System.out.println("Marks in ICT: " + ICTMarks);
        System.out.println("------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------------");
        System.out.println(Button);
    }
}