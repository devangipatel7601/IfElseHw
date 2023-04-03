import java.sql.SQLOutput;
import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);//defining scanner class object

        //Enter year as input
        System.out.println("Enter a year");
        int year= scanner.nextInt();
       //if year is divisible by 4 and not by 100 or is divisible by 400 then it is leap year
        if((year%4==0)&&( year%400==0 || year%100!=0) )
        {
            System.out.println(year+" is a Leap Year"); //to print

        } else
        {
            System.out.println(year+" is not a Leap Year");//if none of above condition met than not a leap year


        }



    }
}
