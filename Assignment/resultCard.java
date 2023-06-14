import java.util.Scanner;

public class resultCard{
    public static void main(String[] args){
        // Input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your registration number: ");
        int reg_no = scan.nextInt();
        System.out.println("Enter your Physics Marks: ");
        int physics = scan.nextInt();
        System.out.println("Enter your Math Marks: ");
        int math = scan.nextInt();
        System.out.println("Enter your English Marks: ");
        int eng = scan.nextInt();
        System.out.println("Enter your PF: Marks ");
        int PF = scan.nextInt();
        System.out.println("Enter your ICT Marks: ");
        int ICT = scan.nextInt();
        scan.close();
        // Calculations
        int totalMarks = 500;
        int obtainedMarks = physics + math + eng + PF + ICT;
        float percentage = ((float)obtainedMarks*100)/(float)totalMarks;
        char grade;
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
        // Making Color Box for Pass and Fail
        String color_box;
        if(grade == 'F'){
                color_box = "\u001B[41m \u001B[30mFail \u001B[0m";
        }
        else{
                color_box = "\u001B[42m \u001B[30mPass \u001B[0m";      
        }
        // Print result card
        System.out.println("\n\n---------Result Card---------");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + reg_no);
        System.out.println("Physics Marks:       " + physics);
        System.out.println("Mathematics Marks:   " + math);
        System.out.println("English Marks:       " + eng);
        System.out.println("PF Marks:            " + PF);
        System.out.println("ICT Marks:           " + ICT);
        System.out.println("Total Marks:         " + totalMarks);
        System.out.println("Obtained Marks:      " + obtainedMarks);
        System.out.println("Percentage:          " + percentage);
        System.out.println("Grade:               " + grade);
        System.out.println(color_box);
        System.out.println("------------------------------");
    }
}