import java.util.Scanner;

public class ps5_5 {
    public static void main(String[] args) {
        
        System.out.println(" finding the factorial of user given no.");
        Scanner  num = new Scanner(System.in);
        System.out.println("user enter yours that you want factorial of ");
        int value = num.nextInt();
        System.out.println("\n");
        int sum = 1;
        System.out.println(value+"!");

        for (int i = value; i >=1; i--) 
        {
            sum = sum *i;
            System.out.println(i+"x"+sum/i+"="+sum);
            
        }

    }
}
