import java.util.Scanner;

public class SalesPersonDetails {
    String sellername,salesid;
    int salesamount,basicsalary,comm;
    Scanner scanner=new Scanner(System.in);  // creating object for scanner class to take input

    void commission(){
        System.out.println("Enter Sales ID");  //acknowledge user what to enter
        salesid= scanner.nextLine();         //storing variable using scanner class

        System.out.println("Enter Seller's Name");  //acknowledge user what to enterkno
        sellername= scanner.nextLine();                 //storing variable using scanner class

        System.out.println("Enter Sales Amount");   //acknowledge user what to enter
        salesamount= scanner.nextInt();             //storing variable using scanner class

        System.out.println("Enter Basic Salary");    //acknowledge user what to enter
        basicsalary= scanner.nextInt();            //storing variable using scanner class

        System.out.println("Commission: ");


        //using nested if else method with Relational Operators
        if (salesamount>=50000)
        {
            System.out.println(salesamount*35/100);

        } else if (salesamount>=30000  && salesamount<50000)
        {
            System.out.println(salesamount*20/100);

        } else if (salesamount>=20000 && salesamount<30000)
        {
            System.out.println(salesamount*10/100);

        } else if (salesamount>=10000 && salesamount<20000)
        {
            System.out.println(salesamount*5/100);

        } else
        {
            System.out.println(10000*2/100);

        }


    }



    public static void main(String[] args) {

        //creating class object to call non-static method into static area
        SalesPersonDetails salesPersonDetails=new SalesPersonDetails();

        //calling method using class object
        salesPersonDetails.commission();
    }

    }



