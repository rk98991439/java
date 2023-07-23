import java.util.Scanner;

public class ps5_9 {
    public static void main(String[] args) {
        System.out.println("sum of no. occuring inthe table of 8. ");
        Scanner value =new Scanner(System.in);
        System.out.println("Enter till were you need sum.");
        int b = value.nextInt();
        int a = 8;
        int sum = 0;
        for (int i = 0; i<=b; i++) 
        {
            sum = sum + (i*a);
            System.out.println(i+" x "+a+" = "+i*a+" sum = "+sum);

        }
        
    }
}
