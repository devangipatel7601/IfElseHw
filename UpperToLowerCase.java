import java.util.Scanner;

public class UpperToLowerCase {
    String alphabet;
    Scanner scanner=new Scanner(System.in);   //defining scanner class object

    void convert()
    {
        //acknowledge user what to enter
        System.out.println("Enter any alphabet in Uppercase");
        alphabet=scanner.nextLine();  //defining object uppercase as an alphabet
        System.out.println(alphabet.toLowerCase());
    }

    public static void main(String[] args)
    {
           //calling non-static method in static area
        UpperToLowerCase upperToLowerCase=new UpperToLowerCase();

        //calling method using class object
        upperToLowerCase.convert();
    }
}
