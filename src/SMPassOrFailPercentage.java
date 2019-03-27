import java.util.Scanner;

public class SMPassOrFailPercentage {
    public static void main(String[] args){
        //Initializing scanner
        Scanner scanner=new Scanner(System.in);
        //Requesting user input for name
        System.out.println("Please enter student name: ");
        String name=scanner.next();

        //Requesting user input for roll number
        System.out.println("Please enter roll number: ");
        int rollNo=scanner.nextInt();

        //Requesting user input for Mark1 / Maths mark
        System.out.println("Please enter Maths mark: ");
        int Mark1=scanner.nextInt();

        //Requesting user input for Mark2 / English mark
        System.out.println("Please enter English mark: ");
        int Mark2=scanner.nextInt();

        //Requesting user input for Mark3 / Science mark
        System.out.println("Please enter Science mark: ");
        int Mark3=scanner.nextInt();

        //Calculating marks total
        int MarksTotal=Mark1+Mark2+Mark3;
        //Calculating marks percentage/average
        int MarksPercentage=MarksTotal/3;

        //Marks total and Marks percentage output
        System.out.println("Marks total = " +MarksTotal);
        System.out.println("Marks percentage/average = " +MarksPercentage);

        //If-else condition to check whether student passed or failed
        //If percentage is less than 35, then failed, otherwise passed
        if (MarksPercentage<35){
            System.out.println("Student " +name+" with roll number " +rollNo+ " FAILED");
        }else{
            System.out.println("Student " +name+" with roll number " +rollNo+ " PASSED");
        }
    }

}