import java.util.Scanner;

public class ps2_3 {
    public static void main (String[] args )
    {
        System.out.println("Q3. to check number 10000 is greater or not then user number ? ");
        Scanner num = new Scanner(System.in);
        
        System.out.print("user enter your desired number = ");
        int num1 = num.nextInt();
        
        int num2 = (10000 - num1);

        System.out.println(10000 <= num1);
        
        System.out.println("this much your number smaller/greater "+num2 );


    }
    
}