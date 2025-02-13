import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowel = 0;
        int consonant = 0;
        int digit = 0;
        int special = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                if(Character.isWhitespace(ch)==false)
                special++;
            }
        }
        System.out.println("Number of vowels in string : " + vowel);
        System.out.println("Number of consonants in string : " + consonant);
        System.out.println("Number of Digits in string : " + digit);
        System.out.println("Number of Special Characters in string : " + special);        
        scanner.close();
    }
}
