import java.util.Scanner;

public class UserCalculator {
    public static void main(String[] args) {
        //Initializing the scanner
        Scanner in=new Scanner(System.in);
        //Requesting user input for two numbers and reading them in
        System.out.println
        ("Please enter two numbers - press Enter after each one: ");
        int x=in.nextInt();
        int y=in.nextInt();
        //Requesting user input for arithmetic operation sign and reading it in
        System.out.println
        ("Please enter what arithmetic operation you would like to" +
        " carry out. \nFor addition enter +, for subtraction enter -, "+
        "for multiplication enter *, for division enter /.");
        char ch1=in.next().charAt(0);
        //Check if the arithmetic sign is + and output addition of two numbers
        if(ch1=='+'){
            System.out.println("Addition of "+x+" and "+y+" is equal to "+(x+y));
        }//Check if the arithmetic sign is - and output subtraction of two numbers
        else if(ch1=='-'){
            System.out.println("Subtraction of "+y+" from "+x+" is equal to "+(x-y));
        }//Check if the arithmetic sign is * and output multiplication of two numbers
        else if(ch1=='*'){
            System.out.println("Multiplication of "+x+" and "+y+" is equal to "+(x*y));
        }//Check if the arithmetic sign is / and output division of two numbers
        else if(ch1=='/'){
            System.out.println("Division of "+x+" by "+y+" is equal to "+(x/y));
        }//Check if anything else, then output invalid entry
        else{
            System.out.println("Invalid operation entry. End of program.");
        }
    }

}
