import java.util.Scanner;

public class AlgebraSymbols {
    Scanner scanner=new Scanner(System.in); //defining object

      //acknowledge user to input value
    void calculation(){
        System.out.println("Enter the first number in integer value");
        int a =scanner.nextInt();  //storing number in variable using scanner object

        System.out.println("Enter the second number in integer value");
        int b =scanner.nextInt();   //storing number in variable using scanner object

        System.out.println("Enter symbol '+' or '-' or '*' or '/'");
        char symbol=scanner.next().charAt(0); //defining character object symbol
        if(symbol=='+')
        {
            System.out.println("Addition "+a+"+"+b+" : " + (a+b) );

        } else if (symbol=='-')
        {
            System.out.println("Subtraction "+a+"-"+b+" : " + (a-b) );

        } else if (symbol =='*')
        {
            System.out.println("Multiplication "+a+"*"+b+" : " + (a*b) );

        } else if (symbol=='/')
        {
            System.out.println("Division "+a+"/"+b+" : " + (a/b) );

        } else
        {
            System.out.println("Invalid");
        }


    }

    public static void main(String[] args)
    {
        //creating class object to call non-static method in static area
        AlgebraSymbols algebraSymbols=new AlgebraSymbols();

        //calling method using class object
        algebraSymbols.calculation();
    }
}
