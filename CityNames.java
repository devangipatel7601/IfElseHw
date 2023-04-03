import java.util.Scanner;

public class CityNames {
    //Input alphabet between a and f to print city name accordingly
    Scanner scanner=new Scanner(System.in);  //defining object c


    void findCitiesNamesAccordingToAlphabets()
    {
        System.out.println("Enter Lowercase Alphabet:");
       String city=scanner.nextLine();    //storing city in variable using scanner object

        //nested if else method using string equals method

        if (city.equals("a"))
        {
            System.out.println("Ahmedabad");

        } else if (city.equals("b"))
        {
            System.out.println("Bengaluru");

        } else if (city.equals("c"))
        {
            System.out.println("Chennai");

        } else if (city.equals("d"))
        {
            System.out.println("Delhi");

        } else if (city.equals("e"))
        {
            System.out.println("Ellore");

        } else if (city.equals("f"))
        {
            System.out.println("Ferozabad");

        } else
        {
            System.out.println("Alphabet is invalid");

        }


        }

    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        CityNames cityNames= new CityNames();

        //calling method using class object
        cityNames.findCitiesNamesAccordingToAlphabets();
    }

    }


