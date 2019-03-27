import java.util.Scanner;

public class FiveNosAverage {
    public static void main(String[] args){
        //Initializing the scanner
        Scanner scanner=new Scanner(System.in);
        //Requesting user input of five numbers and reading them in
        System.out.println("Please enter five numbers to calculate" +
                " their average. Press Enter after each entry.");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();
        double e=scanner.nextDouble();
        //Calculating the average and the output
        double ave=(a+b+c+d+e)/5;
        System.out.println("The average of these five numbers is: "+ave);
    }
}
