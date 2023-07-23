import java.util.Scanner;

import javax.swing.SwingConstants;

public class ps4_2 {
    static void myMethod(float sub) {
        if (sub >= 33) {
            System.out.println("you are pass in this subject "+sub+"%/n");
            
        } else {
            System.out.println("you are fail in this subject "+sub+"%/n");
            
        } 
        
    }    
    public static void main(String[] args) {
        System.out.println("Checking is student is passed or failed all subject /n per subject min marks reqared is 33% and total all subject is 40%");

        Scanner sub = new Scanner(System.in);


        System.out.println("enter your subject 1 marks");
        float sub1 = sub.nextFloat();

        System.out.println("enter your subject 2 marks");
        float sub2 = sub.nextFloat();

        System.out.println("enter your subject 3 marks");
        float sub3 = sub.nextFloat();

        System.out.println("subject 1 ");
        myMethod(sub1);  

        System.out.println("subject 2 ");
        myMethod(sub2);       

        System.out.println("subject 3 ");
        myMethod(sub3);    
      

        System.out.println("over all pass or fail ");

        float check = ((sub1+sub2+sub3)/3) ;

        Boolean check2 = (check >= 40 );

        String check3 = new Boolean(check2).toString();


        switch (check3) 
        {
            case "false":
            System.out.println("Sorry you are fail in this semeter");
            break;
            case "true":
            System.out.println("you have been permoted to the next semeter");
            break;
            default:
            System.out.println("chech your values");

        }
        
       
    }
}
