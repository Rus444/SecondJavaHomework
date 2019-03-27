import java.util.Scanner;

public class UpperToLowerCase {
    public static void main(String[] args){
        //Initializing scanner
        Scanner in=new Scanner(System.in);
        //Requesting user input and reading it in
        System.out.println("Please enter a character: ");
        char char1=in.next().charAt(0);
        //Converting uppercase char to lowercase char and output
        char char2=Character.toLowerCase(char1);
        System.out.println("Lowercase of "+char1+" is "+char2);
    }
}
