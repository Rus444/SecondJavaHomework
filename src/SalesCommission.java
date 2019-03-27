import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args){
        //Initializing the scanner
        Scanner in=new Scanner(System.in);
        //Requesting user input for sales ID and reading it in
        System.out.println("Please enter your sales ID: ");
        String id=in.next();
        //Requesting user input for name and reading it in
        System.out.println("Please enter your name: ");
        String eName=in.next();
        //Requesting user input for basic salary and reading it in
        System.out.println("Please enter your basic salary: ");
        double bSalary=in.nextInt();
        //Requesting user input for sales amount and reading it in
        System.out.println("Please enter your sales amount: ");
        double sales=in.nextInt();
        //Declaring sales commission as a decimal point number
        double sCommission;
        //Check if sales value is less than 0, then invalid entry
        if (sales<0){
            System.out.println("Invalid entry. End of program.");
        }//Check if sales commission is between 0 and 10,000
        //then commission is 2% and output all info
        else if(sales<10000){
            sCommission=sales/50;
            System.out.println("Employee "+eName+" with ID: "+id+
                    "\nearns a basic salary of £"+bSalary+""+
                    "\nand his/her sales commission is £"+sCommission);
        }////Check if sales commission is between 10,000 and 20,000
        //then commission is 5% and output all info
        else if(sales>=10000 && sales<20000){
            sCommission=sales/20;
            System.out.println("Employee "+eName+" with ID: "+id+
                    "\nearns a basic salary of £"+bSalary+""+
                    "\nand his/her sales commission is £"+sCommission);
        }//Check if sales commission is between 20,000 and 30,000
        //then commission is 10% and output all info
        else if(sales>=20000 && sales<30000){
            sCommission=sales/10;
            System.out.println("Employee "+eName+" with ID: "+id+
                    "\nearns a basic salary of £"+bSalary+""+
                    "\nand his/her sales commission is £"+sCommission);
        }//Check if sales commission is between 30,000 and 50,000
        //then commission is 20% and output all info
        else if(sales>=30000 && sales<50000){
            sCommission=sales/5;
            System.out.println("Employee "+eName+" with ID: "+id+
                    "\nearns a basic salary of £"+bSalary+""+
                    "\nand his/her sales commission is £"+sCommission);
        }////Check if sales commission is above 50,000
        //then commission is 35% and output all info
        else if(sales>=50000){
            sCommission=sales*35/100;
            System.out.println("Employee "+eName+" with ID: "+id+
                    "\nearns a basic salary of £"+bSalary+""+
                    "\nand his/her sales commission is £"+sCommission);
        }
        }
    }