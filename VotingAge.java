import java.util.Scanner;

public class VotingAge {
    Scanner scanner=new Scanner(System.in);//defining object

    void voteEligibility()
    {         //
        System.out.println("Enter age of the Person in int value");

        //storing age in variable using scanner object
        int age= scanner.nextInt();

        if (age>=18)
        {
            System.out.println("You are eligible for Vote as your age is: " + age);

        } else
        {
            System.out.println("You are ineligible for Vote as your age is: " + age);

        }
    }

    public static void main(String[] args)
    {

        //creating class object to call non-static method in static area
        VotingAge votingAge=new VotingAge();

        //calling method using class object
        votingAge.voteEligibility();
    }
}
