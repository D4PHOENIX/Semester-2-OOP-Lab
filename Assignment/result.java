import java.util.Scanner;
class StudentData{
    String userName, Button;
    int regNo;
    int phyMarks, mathMarks, engMarks, PFMarks, ICTMarks;
    int totalMarks = 500, obtainedMarks;
    float percentage;
    char grade;
    // Taking input from user
    public void userInput(){
        System.out.println("\n\nEnter the details of the student: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.userName = input.nextLine();
        System.out.println("Enter your registration number: ");
        this.regNo = input.nextInt();
        System.out.println("Enter your marks in Physics: ");
        this.phyMarks = input.nextInt();
        System.out.println("Enter your marks in Mathematics: ");
        this.mathMarks = input.nextInt();
        System.out.println("Enter your marks in English: ");
        this.engMarks = input.nextInt();
        System.out.println("Enter your marks in PF: ");
        this.PFMarks = input.nextInt();
        System.out.println("Enter your marks in ICT: ");
        this.ICTMarks = input.nextInt();
        // input.close();
    }
// Printing the result
    public void printResult(){
        System.out.println("\n\n---------Result Card---------");
        System.out.println("Name: " + this.userName);
        System.out.println("Registration Number: " + this.regNo);
        System.out.println("------------------------------");
        System.out.println("Marks in Physics: " + this.phyMarks);
        System.out.println("Marks in Mathematics: " + this.mathMarks);
        System.out.println("Marks in English: " + this.engMarks);
        System.out.println("Marks in PF: " + this.PFMarks);
        System.out.println("Marks in ICT: " + this.ICTMarks);
        System.out.println("------------------------------");
        System.out.println("Total Marks: " + this.totalMarks);
        System.out.println("Obtained Marks: " + this.obtainedMarks);
        System.out.println("Percentage: " + this.percentage);
        System.out.println("Grade: " + this.grade);
        System.out.println("------------------------------");
        System.out.println(this.Button);
        System.out.println("------------------------------");
    }    
    // Calculating percentage and grade
    public void calculations(){
        this.obtainedMarks = this.phyMarks + this.mathMarks + this.engMarks + this.PFMarks + this.ICTMarks;
        this.percentage = ((float)this.obtainedMarks*100)/(float)this.totalMarks;
        if(this.percentage >= 90){
            this.grade = 'A';
        }
        else if(this.percentage >= 80 && this.percentage < 90){
            this.grade = 'B';
        }
        else if(this.percentage >= 70 && this.percentage < 80){
            this.grade = 'C';
        }
        else if(this.percentage >= 60 && this.percentage < 70){
            this.grade = 'D';
        }
        else if(this.percentage>= 50 && this.percentage < 60){
            this.grade = 'E';
        }
        else{
            this.grade =  'F';  
        }
    }
    // Defining Coloured Button
    public void button(){    
        switch(this.grade){
            case 'F':
                this.Button = "\u001B[41m \u001B[30m You have failed the exam \u001B[0m";
                break;
            default:
                this.Button = "\u001B[42m \u001B[30m You have passed the exam \u001B[0m";
                break;      
        }
}
public class result{
    public static void main(String[] args){
        StudentData daud = new StudentData();
        StudentData ghost = new StudentData();
        daud.userInput();
        ghost.userInput();
        daud.calculations();
        ghost.calculations();
        daud.button();
        ghost.button();
        daud.printResult();
        ghost.printResult();
    }
}
}