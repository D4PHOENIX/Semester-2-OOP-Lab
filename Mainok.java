
import java.util.*;
import java.awt.*;

public class Mainok {
    public static void main(String[] args) {
        char grade;
        float percentage;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter OOP marks");
        int OOP = scan.nextInt();

        System.out.println("enter  DLD marks");
        int DLD = scan.nextInt();

        System.out.println("enter English marks");
        int english = scan.nextInt();

        System.out.println("enter linear Algerbra marks");
        int linear_algerbra = scan.nextInt();

        System.out.println("enter DBS marks");
        int DBS = scan.nextInt();
        scan.close();

        int totalMarks = 500;
        int TotalObtainMarks = OOP + DLD + english + linear_algerbra + DBS;
        percentage = (TotalObtainMarks * 100 / totalMarks);

        if (percentage <= 60) {
            grade = 'F';
        } else if (percentage <= 70) {
            grade = 'D';

        } else if (percentage <= 80) {
            grade = 'B';

        } else {
            grade = 'A';

        }
        // table
        System.out.println("OOP \t DLD \t English \t Linear Algebra \t DBS \t Total Obtain Marks \t percentage \t Grade");
        System.out.println(OOP + "\t" + DLD + "\t" + english + "\t" + linear_algerbra + "\t" + DBS + "\t"
                + TotalObtainMarks + "\t\t\t\t" + percentage + "\t\t\t\t" + grade + "\t\t");

        if (percentage >= 50) {
            setColor(Color.GREEN);
        } else {
            setColor(Color.RED);
        }

    }

    public static void setColor(Color color) {
        // Set the text color of the console output
        String colorCode = String.format("\u001B[38;2;%d;%d;%dm", color.getRed(), color.getGreen(), color.getBlue());
        System.out.print(colorCode);
    }

}