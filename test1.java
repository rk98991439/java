import java.util.Scanner;

public class test1
{
    public static void main(String[] args)
    {
        System.out.println("enter the input user");

        Scanner value = new Scanner (System.in);
        
        System.out.println("what's is your number");
        int a = value.nextInt();
       // boolean check1 = value.hasNextInt();
       // System.out.println(check1);

        System.out.println("what's is your second number");
        int b = value.nextInt();
       // boolean check2 = value.hasNextInt();
       // System.out.println(check2);
       System.out.print("the sum is = ");

        System.out.println(a+b);



    }

}
