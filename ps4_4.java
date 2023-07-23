import java.util.Scanner;

public class ps4_4 {
    public static void main(String[] args) {
        System.out.println("Q4. if 1 = monday , 2 = tuesday so on ?");
        Scanner day = new Scanner(System.in);
        int day_no = day.nextInt();

        switch (day_no) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thusday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Satday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
            System.out.println("where are you form");
        }

        
        
    }
}
