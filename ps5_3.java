import java.util.Scanner;

public class ps5_3 {
    public static void main(String[] args) {
        System.out.println("multiple of tables of user no.");
        Scanner  num = new Scanner(System.in);
        System.out.println("user enter your no. ");
        int value = num.nextInt();
        System.out.println("till were \n\n like :- 2xn=2n what is n ");
        int value2 = num.nextInt();



        for (int i = 1; i <=value2; i++) 
        {
            System.out.println(i*value);
            
        }


        
    }
}
