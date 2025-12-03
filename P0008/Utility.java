package P0008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

    private Map<Character, Integer> charCounter = new HashMap<>();
    private Map<String, Integer> wordCounter = new HashMap<>();

    public String getData() {
        Scanner scanner = new Scanner(System.in);
        String content;
        while (true) {
            System.out.println("Enter your content: ");
            content = scanner.nextLine().trim();

            if (content.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter valid content.");
            } else if (!content.matches(".*[a-zA-Z0-9].*")) {
                System.out.println("Input must contain at least one alphanumeric character. Please try again.");
            } else {
                break;
            }
        }
        return content;
    }

    public void analyze(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch))
                continue;
            charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
        }
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            wordCounter.put(token, wordCounter.getOrDefault(token, 0) + 1);
        }
    }

    public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }
}
