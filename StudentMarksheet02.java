import java.util.Scanner;

public class StudentMarksheet02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //defining scanner class object

        System.out.println("Enter Student Name");
        String name = scanner.nextLine();
        System.out.println("Enter Roll no");
        int roll = scanner.nextInt();
        System.out.println("Enter marks in Maths,English,Science");
        int maths = scanner.nextInt();
        int english = scanner.nextInt();
        int science = scanner.nextInt();
        int total = maths + english + science;
        double percentage = (total / 3);

        System.out.println("Total:" + total);
        //System.out.println("Percentage:" + percentage);

        //if else nested method using operators
        if (maths >= 35 && english >= 35 && science >= 35)
        {
            System.out.println("You are Pass");

            if (percentage >= 80)
            {
                System.out.println("Your grade is A+");

            } else if (percentage >= 60)
            {
                System.out.println("Your grade is A");

            } else if (percentage >= 50)
            {
                System.out.println("Your grade is B");

            } else if (percentage >= 35)
            {
                System.out.println("Your grade is C");
            }

        }else
        {
            System.out.println("You are Fail");
        }
    }
}
