import java.util.Scanner;

public class ps1_1 
{

 public static void main(String[] args)
{
    System.out.println("the sum of three number ");
    Scanner num = new Scanner(System.in);
    
    System.out.println("enter your frist no. ");
    int num1 = num.nextInt();

    System.out.println("enter your second no. ");
    int num2 = num.nextInt();

    System.out.println("enter your third no. ");
    int num3 = num.nextInt();

    int sum = (num1+num2+num3);
    System.out.println("So the sum is = "+sum);

}
}