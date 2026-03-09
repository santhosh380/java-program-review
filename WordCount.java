import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");

        String sentence = sc.nextLine();

        String upper = sentence.toUpperCase();

        System.out.println("Uppercase sentence: " + upper);

        sc.close();
    }
}
