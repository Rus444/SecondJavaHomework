import java.util.Scanner;

public class CharNumberSymbol {
    public static void main(String[] args){
        //Initializing scanner
        Scanner in=new Scanner(System.in);

        //Requesting user input and reading it in
        System.out.println("Please enter any value: ");
        char value=in.next().charAt(0);
        //Check if the entered value is a number
        if(Character.isDigit(value)){
            System.out.println("The entered value is a number.");

        //Check if the entered value is an alphabet
        }else if(Character.isLetter(value)){
            System.out.println("The entered value is an alphabet.");

        //Check if the entered value is a symbol (or anything else)
        }else{
            System.out.println("The entered value is a symbol.");
        }
    }
}
