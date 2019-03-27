import java.util.Scanner;

public class OddOrEvenTernary {
    public static void main(String[] args){
        //Initializing scanner scann for user input
        Scanner scann = new Scanner(System.in);

        //Requesting input from user
        System.out.println("Please enter an integer number: ");

        //System output in case the number is odd
        String odd="This is an odd number";

        //System output in case the number is even
        String even="This is an even number";

        //User input
        int num=scann.nextInt();

        //Ternary operator to determine whether the user-entered
        //number is odd or even based on the remainder value
        String rem=(num%2)==1?odd:even;

        //System response based on the above condition
        // being true or false
        System.out.println(rem);
    }
}