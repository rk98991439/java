import java.util.Scanner;
public class ps1_5 {
    public static void main(String[] args) 
    {
        System.out.println("To check Whether a number is integer enter by User? ");
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter your Number = ");

        boolean value1 = num.hasNextInt();
        System.out.println(value1);


        
    }
    
}
