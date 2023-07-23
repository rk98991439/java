import java.util.Scanner;

public class ps1_3 
{
    public static void main (String[] args)
    {
        System.out.println("Asking user name and greeting them ?");
        Scanner user = new Scanner(System.in);

        System.out.println("User please enter your name.");
        String name = user.nextLine();
         
        String wishes = ("The stars can't outshine the path of your future. May all your dreams become a reality.");
        System.out.println("hello "+name+" have a Good day.\n");
        System.out.println(wishes);
    }
}
