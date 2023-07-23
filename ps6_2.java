import java.util.Scanner;

public class ps6_2 {
    public static void main(String[] args) {
        System.out.println("finding whether user no. is integer or not .");
        int [] value = new int [5];
        value [0] = 13;       
        value [1] = 45;       
        value [2] = 21;       
        value [3] = 10;       
        value [4] = 19;   
        Scanner num = new Scanner(System.in);
        System.out.println("user enter the number");
        int num1 = num.nextInt();
        int [] value1 = {num1};
        for (int i = 0; i < value.length; i++) 
        {
            if (value[i]==num1) {

                System.out.println("yes "+value1+" is in the matrix.");
                
            } else { System.out.println("the no. is not present");
                
            }
        }
    }
}
