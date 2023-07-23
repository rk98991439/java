import java.util.Scanner;
public class ps1_4 {
    public static void main(String[] args)
    {
        System.out.println("Q4. convert Kilometer to miles");
         Scanner distance = new Scanner(System.in);
         
         System.out.println("enter the distance in kilometer. ");
         float distance1 = distance.nextFloat();

         float total_distance = (distance1*0.62137f);
         System.out.println(total_distance+" Mile(s)");
    }
    
}
