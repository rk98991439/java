import java.util.Scanner;

public class ps4_3 {
    public static void main(String[] args) {
    System.out.println("Q3. Calculating income of a emplyee as mentioned below: \n Income salary    Tax\n 2.5Lac - 5.0Lac   5%\n 5.0Lac - 10.0Lac   20%\n Above 10.0Lac   30%");
    Scanner salary = new Scanner(System.in);
    System.out.println("Enter you salary form above");
    float val = salary.nextFloat();

    if (val >= 2.5f && val <=5.0f) {
         System.out.println("you have 5% tax ");
    } else if ( val >= 5.0f && val <= 10.0f) {
        System.out.println("you have 20% tax ");
    } else if ( val >= 10.0f){
        System.out.println("you have 30% tax ");
    } else {
        System.out.println("you have No tax ");
        
    }

    // switch (val) {
    //     case (2):
    //     System.out.println("you have 5% tax ");
    //         break;
    //         case (5):
    //     System.out.println("you have 5% tax ");
    //         break;
    //         case (10):
    //     System.out.println("you have 5% tax ");
    //         break;
    //     default:
    //     System.out.println("check the value ");
    // }

        
    }
}
