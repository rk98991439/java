import java.util.Scanner;

public class ps5_2 {
    public static void main(String[] args) {
        
        System.out.println("sum of first even num.");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        // int a = 4;
        int sum = 0;
        int cnt = 1;
        for(int i = 1; cnt<=a; i++ )
        { 
        
            if ((i%2)==0)
            {
                System.out.print(" \n "+i+ " = even \n");
                sum = sum + i;
                cnt++;

            }
            

        }
        System.out.println(sum);
    }
}
