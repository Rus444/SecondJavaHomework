import java.util.Scanner;

public class PosNegOrZero {
    public static void main(String[] args){
        //Initializing the scanner
        Scanner in=new Scanner(System.in);
        //Requesting user input and reading it in
        System.out.println("Please enter any number (positive, negative or zero): ");
        int x=in.nextInt();
        //Check if the number is negative
        if (x<0){
            System.out.println("This is a negative number.");
        }//Check if the number is positive
        else if (x>0){
            System.out.println("This is a positive number.");
        }//Check if the number is zero
        else{
            System.out.println("This number is 0 (Zero).");
        }
    }
}