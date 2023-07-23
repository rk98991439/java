import java.util.Scanner;

public class ps4_5 {
    public static void main(String[] args) {
         System.out.println("Q5. finding leap year");
         Scanner num = new Scanner(System.in);
         System.out.println("Enter you year");
         int year = num.nextInt();
        //  int check1 = ( year/4 );
        //  int check2 = ( year/100 );
        //  int check3 = ( year/400 );
        //  int check =  (year%4);
        //  int check4 = (year%400);
        //  Boolean test = (0 == check || 0 == check4);
        if( year%4 == 0 && year%100 == 0 && year%400==0){
            System.out.println("it is a leap year");
                            
            } else {
                System.out.println("it is not a leap year ");
                
            }

        }

        //  System.out.println( test );

 /* partham bhiya */
    //     boolean a=leap(year);
    //     System.out.println(a);

    // }
    // static public boolean leap(int year){
    //     if(year%4 == 0 && year%100 == 0 && year%400==0 ){
    //         return true;
    //     }return false;
    // }
    
}
