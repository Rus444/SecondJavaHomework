import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        //Initializing the scanner
        Scanner in=new Scanner(System.in);
        //Requesting user input for any value and reading it in
        System.out.println("Please enter a letter from English alphabet: ");
        char char1=in.next().charAt(0);
        //Check if the input is a vowel - upper or lower case
        //and output Vowel
        if(char1=='a' || char1=='A' || char1=='e' || char1=='E' ||
           char1=='i' || char1=='I' || char1=='o' || char1=='O' ||
           char1=='u' || char1=='U'){
            System.out.println("Input letter is a Vowel.");
        }//Check if any other value, then output consonant
        else{
            System.out.println("Input letter is a Consonant.");
        }
    }
}
