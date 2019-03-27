import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        //Allocate memory for a, b and temp
        int a, b, temp;
        //Initialize scanner
        Scanner in=new Scanner(System.in);
        //Request user to input a
        System.out.println("Please enter first number - a: ");
        a=in.nextInt();
        //Request user to input b
        System.out.println("Please enter second number - b: ");
        b=in.nextInt();
        //Numbers before swap
        System.out.println("Before swap a = " +a+ " and b = "+b);

        //Swap the numbers using temp
        temp=a;
        a=b;
        b=temp;

        //Numbers after swap
        System.out.println("After swap a = " +a+ " and b = "+b);

    }
}
