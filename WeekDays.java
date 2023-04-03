import java.util.Scanner;

public class WeekDays {
    Scanner scanner=new Scanner(System.in); //defining object

      //Input any number to print day of the week
    void daysOfWeek()
    {
        //acknowledge user what to enter
        System.out.println("Enter any number between 1 to 7 in int value");

        //storing number in variable using scanner object
        int num=scanner.nextInt();
        if (num==1){
        System.out.println("This is Sunday");

    } else if (num==2)
    {
            System.out.println("This is Monday");

    } else if (num==3)
    {
            System.out.println("This is Tuesday");

    } else if (num==4)
    {
            System.out.println("This is Wednesday");

    } else if (num==5)
    {
            System.out.println("This is Thursday");

    } else if (num==6)
    {
            System.out.println("This is Friday");

    } else if (num==7)
    {
            System.out.println("This is Saturday");

    } else
    {
            System.out.println("Invalid Entry");

    }



    }

    public static void main(String[] args)
    {
        WeekDays weekDays=new WeekDays(); // creating class object to call non-static method in static area

        weekDays.daysOfWeek(); //calling method using class object
    }

    }




