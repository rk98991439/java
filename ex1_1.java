import java.util.Scanner;
public class ex1_1 {
    public static void main (String[] args) 
    {
        System.out.println("Enter your marks as per subjects");
        Scanner marks = new Scanner(System.in); 

        System.out.println("English");
        int English = marks.nextInt();

        System.out.println("Maths");
        int Maths = marks.nextInt();

         System.out.println("Physics");
        int Physics = marks.nextInt();

        System.out.println("Chemistry");
        int Chemistry = marks.nextInt();

        System.out.println("Biology");
        int Biology = marks.nextInt();

        System.out.print("Total Marks in all Subjects obtain out of 500 = ");
        int totalmarks = (English+Maths+Physics+Chemistry+Biology);
        System.out.println(totalmarks);
        


        int persentage =  (totalmarks/5);
        System.out.println("Total persentage is = "+persentage+"%");

        
    }
    
}
