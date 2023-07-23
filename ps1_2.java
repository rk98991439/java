import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;
public class ps1_2 {
    public static void main(String[] args)
    {
        System.out.println("calculate CGPA of Three subject marks out of 100");
        Scanner marks = new Scanner(System.in);

        System.out.println("enter your marks of subject 1 .");
        int sub1 = marks.nextInt();

        System.out.println("enter your marks of subject 2 .");
        int sub2 = marks.nextInt();
        
        System.out.println("enter your marks of subject 3 .");
        int sub3 = marks.nextInt();
        
        int Total = (sub1+sub2+sub3);
        System.out.println("Total marks = "+Total);

        double CGPA = (Total/30d);
        System.out.println("CGPA is = "+CGPA);

    }

}
