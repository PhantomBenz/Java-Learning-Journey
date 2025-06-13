import java.util.Scanner;
public class b_StringIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String input = sc.next();            // Read a single word input
        
        System.out.println("You entered: " + input);
        System.out.println("Length of the word: " + input.length());

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();     // Read a full line input
        System.out.println("You entered: " + sentence);
        System.out.println("Length of the sentence: " + sentence.length());
        
        sc.close();
    }
}
