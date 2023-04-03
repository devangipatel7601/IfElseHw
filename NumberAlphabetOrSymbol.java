import java.util.Scanner;

public class NumberAlphabetOrSymbol {
    Scanner scanner=new Scanner(System.in);
     //ASCII value range-
    //for capital alphabets 65-90
    //for small alphabets 97-122
    //for digits 48-57

    void alphanumericorsymbol(){
        System.out.println("Enter Alphabet, Number or Symbol");
        char value=scanner.next().charAt(0);  //mentioning character

        if (value>=65 && value<=122)
        //other way if (value>='a' && value<='z') || (value>='A' && value<='Z')
        {
            System.out.println("It is an Alphabet");

        } else if (value>=48 && value<=57)
        //other way if (value>= '0' ££ value<='9')
        {
            System.out.println("It is a Number/Digit");

        } else
        {
            System.out.println("Its a Symbol");
        }
    }

    public static void main(String[] args) {

        //creating class object to call non-static method into static area
        NumberAlphabetOrSymbol numberAlphabetOrSymbol=new NumberAlphabetOrSymbol();

        //calling method using object class
        numberAlphabetOrSymbol.alphanumericorsymbol();
    }
}
