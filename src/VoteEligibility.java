import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args){
        //Initializing the scanner
        Scanner in=new Scanner(System.in);
        //Requesting user input for age and reading it in
        System.out.println("Please enter your age: ");
        int age=in.nextInt();
        //Check if 18 or over, then eligible to vote
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }//Check if  under 18, then not eligible to vote
        else{
            System.out.println("Your are NOT eligible to vote.");
        }
    }
}
