import java.util.Scanner;

public class InterchangedValue {
    int x,y,t;  //x and y are to interchanged/swap
    Scanner scanner=new Scanner(System.in);
    void swap(){
        System.out.println("Enter value of X and Y in integer");
        x= scanner.nextInt();
        y= scanner.nextInt();
        System.out.println("Before interchanging numbers: "+x +" "+y);

        //Interchanging/swapping
        t=x;
        x=y;
        y=t;
        System.out.println("After interchanging numbers: "+x +" "+y);

    }

    public static void main(String[] args) {

        //creating class object to call non-static method in static area
        InterchangedValue interchangedValue=new InterchangedValue();

        //calling method using class object
        interchangedValue.swap();


    }





}
