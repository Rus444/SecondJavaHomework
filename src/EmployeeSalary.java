import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args){
        //Initializing scanner
        Scanner scanner = new Scanner(System.in);
        //Requesting user input for employee ID and reading it in
        System.out.println("Please enter your Employee ID: ");
        String id=scanner.next();
        //Requesting user input for employee name and reading it in
        System.out.println("Please enter your name: ");
        String eName=scanner.next();
        //Requesting user input for employee salary and reading it in
        System.out.println("Please enter your salary: ");
        double bSalary=scanner.nextInt();
        //Calculating HRA, DA, TA, PF and Gross Salary
        double hra=bSalary/10;
        double da=bSalary*8/100;
        double ta=bSalary*9/100;
        double pf=bSalary/5;
        double grossSalary=bSalary+hra+da+ta-pf;
        //Output of HRA, DA, TA, PF and Gross Salary
        System.out.println
                ("You are "+eName+" and your Employee ID is: "+id+
                ". \nYour HRA = "+hra+
                ", \nyour DA = "+da+
                ", \nyour TA = "+ta+
                ", \nyour PF = "+pf+
                " \nand your Gross Salary = "+grossSalary);
    }
}
