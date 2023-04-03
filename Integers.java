
import java.util.Scanner;

public class Integers {
    //object of Scanner class
    Scanner scanner= new Scanner(System.in);
    // input number to check
    int number;

    //method
    void number(){
        System.out.println("Enter a Integer");

        //reading a number from user
        number = scanner.nextInt();

        //checks number is greater than zero or not
    if (number>0)
    {
        System.out.println("Number is Positive");

        //checks number is less than zero or not
    }  else if (number<0)
    {
        System.out.println("Number is Negative");

        //executes when above 2 conditions returns false
    }  else
    {
        System.out.println("Number is Zero");
    }

    }

    public static void main(String[] args) {

        //creating class object to call non-static method in static area
        Integers integers=new Integers();

        //calling method using class object
        integers.number();

    }
}
