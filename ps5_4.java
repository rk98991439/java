import java.util.Scanner;

public class ps5_4 {
    public static void main(String[] args) {
        System.out.println("multiple of tables in reverse of user no.");
        Scanner  num = new Scanner(System.in);
        System.out.println("user enter of yours thst you want table of ");
        int value = num.nextInt();
        System.out.println(" were it should be start \n\n like :- 2xn=2n what is n ");
        int value2 = num.nextInt();
        System.out.println("\n");


        for (int i = value2; i >=1; i--) 
        {
            System.out.println(i*value);
            
        }


    
    
        
    }
}
