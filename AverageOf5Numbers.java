import java.util.Scanner;

public class AverageOf5Numbers {

    static Scanner scanner= new Scanner(System.in);  //defining object

    void average()
    {
        System.out.println("Enter Number 1");
        int num1= scanner.nextInt();
        System.out.println("Enter Number 2");
        int num2= scanner.nextInt();
        System.out.println("Enter Number 3");
        int num3= scanner.nextInt();
        System.out.println("Enter Number 4");
        int num4= scanner.nextInt();
        System.out.println("Enter Number 5");
        int num5= scanner.nextInt();
        int avg=(num1+num2+num3+num4+num5/5);

        System.out.println("Average=" +avg);

    }

    public static void main(String[] args)
    {
        //creating class object to call non-static method in static area
        AverageOf5Numbers averageOf5Numbers=new AverageOf5Numbers();

        //calling method using class object
        averageOf5Numbers.average();


    }

}
