import java.util.Scanner;

public class ps3_1 {
    public static void main(String[] args) {
        System.out.println(" enter any word to convert in lower case .");
        Scanner word = new Scanner(System.in);

        System.out.println("your word =");
        String word1 = word.next();

        System.out.println(word1.toLowerCase());

        
    }
}
