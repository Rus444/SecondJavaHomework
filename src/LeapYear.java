import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        //Initializing scanner scan for user input
        Scanner scan = new Scanner(System.in);

        //Request user to input the year
        System.out.println
        ("Please enter the year to find out if it's a leap year or not: ");

        //System output in case of LEAP year
        String leap="This is a leap year";

        //System output in case of non-Leap year
        String notLeap="This is NOT a leap year";

        //User input
        int y=scan.nextInt();

        //Ternary operator to determine
        // whether the year is leap or not
        String rem=(y%4)==0?leap:notLeap;

        //System response based on the above condition
        //being true or false
        System.out.println(rem);
    }
}
