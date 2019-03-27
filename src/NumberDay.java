import java.util.Scanner;

public class NumberDay {
    public static void main(String[] args){
        //Initializing the scanner
        Scanner in = new Scanner(System.in);
        //Requesting user input and reading it in
        System.out.println("Please enter any number between 1 and 7.");
        int num=in.nextInt();
        //Check if input is 1, then output Monday
        if(num==1) {
            System.out.println("This number corresponds to Monday.");
        }//Check if input is 2, then output is Tuesday
        else if(num==2) {
            System.out.println("This number corresponds to Tuesday.");
        }//Check if input is 3, then output is Wednesday
        else if(num==3) {
            System.out.println("This number corresponds to Wednesday.");
        }//Check if input is 4, then output is Thursday
        else if(num==4) {
            System.out.println("This number corresponds to Thursday.");
        }//Check if input is 5, then output is Friday
        else if(num==5) {
            System.out.println("This number corresponds to Friday.");
        }//Check if input is 6, then output is Saturday
        else if(num==6){
            System.out.println("This number corresponds to Saturday.");
        }//Check if input is 7, then output is Sunday
        else if(num==7){
            System.out.println("This number corresponds to Sunday.");
        }//Check if input is anything else, then output is Invalid
        else {
            System.out.println("Invalid entry.");
        }
    }
}
