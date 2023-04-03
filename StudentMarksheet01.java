import java.util.Scanner;

public class StudentMarksheet01 {

    public static void main(String[] args) {
        String name;
        int roll,maths,eng,sci;
        Scanner scanner = new Scanner(System.in);//defining scanner class object

        //acknowledge user what to enter
        System.out.println("Enter Student Name");
        name=scanner.nextLine();
        System.out.println("Enter Roll No. in integer value");
        roll=scanner.nextInt();
        System.out.println("Enter marks in Maths,English,Science in integer value");
        maths=scanner.nextInt();
        eng=scanner.nextInt();
        sci=scanner.nextInt();
        int total = maths+eng+sci;
        double percentage=(total/3);
       System.out.println("Student Name: " +name);

       System.out.println("Roll Num: "+roll);

        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: " +percentage);

        if (percentage>=80)
        {
            System.out.println("Result: PASS"+"        "+"Grade: Your grade is A+");

        } else if (percentage>=60 && percentage<80)
        {


        } else if (percentage>=50  && percentage<60)
        {
            System.out.println("Result: PASS"+"        "+"Grade: Your grade is B");

        } else if (percentage>=35 && percentage<50)
        {
            System.out.println("Result: PASS"+"         "+"Grade: Your grade is C");

        } else
        {
            System.out.println("Result: You are Fail");



        }



    }





}
