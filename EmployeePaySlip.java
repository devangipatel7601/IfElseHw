import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeePaySlip {


    public static void main(String[] args) {
        //for entering input call scanner method
        Scanner scanner=new Scanner(System.in);

        String employeeid;  //storing id in variable

        double basicsalary,Grosssalary,HRA,DA,TA,PF;
        String employeename;

        //for entering employee id as input
        System.out.println("Enter Employee ID");
        employeeid = scanner.nextLine();

         //for entering employee name as input
        System.out.println("Enter Employee Name");
        employeename= scanner.nextLine();
        System.out.println("Enter Basic Salary");
        basicsalary= scanner.nextDouble();

        HRA= (basicsalary*10/100);
        DA=(basicsalary*8/100);
        TA=(basicsalary*9/100);
        PF=(basicsalary*20/100);
        Grosssalary= basicsalary+HRA+DA+TA-PF;
        System.out.println("Employee ID: " +employeeid);
        System.out.println("Employee Name: " +employeename);
        System.out.println("Employee Basic Salary: " + basicsalary);
        System.out.println("HRA =" +HRA);
        System.out.println("DA =" +DA);
        System.out.println("TA =" +TA);
        System.out.println("PF =" +PF);
        System.out.println("Grosssalary =" +Grosssalary);











    }
}
