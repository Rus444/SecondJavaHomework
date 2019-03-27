import java.util.Scanner;

public class AtoFCityName {
    public static void main(String[] args){
        //Initializing scanner
        Scanner in=new Scanner(System.in);

        //Requesting user input and reading it in
        System.out.println("Please enter a character: ");
        char kar=in.next().charAt(0);

        //Check if the input is character a/A
        if(kar=='a'||kar=='A'){
            System.out.println("Aberdeen");
        //Check if the input is character b/B
        }else if(kar=='b'||kar=='B'){
            System.out.println("Birmingham");
        //Check if the input is character c/C
        }else if(kar=='c'||kar=='C'){
            System.out.println("Cambridge");
        //Check if input is character d/D
        } else if(kar=='d'||kar=='D'){
            System.out.println("Dundee");
        //Check if input is character e/E
        }else if(kar=='e'||kar=='E'){
            System.out.println("Edinburgh");
        //Check if input is character f/F
        }else if(kar=='f'||kar=='F'){
            System.out.println("Felixstow");
        //Check if input is anything else
        }else{
            System.out.println("Invalid entry");
        }
    }
}
