import java.util.Scanner;

public class ps4_6 {

    public static void main(String[] args) {

        System.out.println("Q6. find sites are for on for.");

        Scanner site = new Scanner(System.in);
        System.out.println("enter your sites ");
        String web = site.next();


        System.out.println("it is commercial "+ web.endsWith(".com"));
        System.out.println("it is organigation "+ web.endsWith(".org"));
        System.out.println("it is indian website "+ web.endsWith(".in"));
    }
}
