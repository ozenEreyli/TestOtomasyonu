import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterSet {

    public static Set<Character> findUniqueCharacters(String text, String word1, String word2) {
        Set<Character> uniqueCharacters = new HashSet<>();
        int word1Index = -1;
        int word2Index = -1;
        boolean foundWord1 = false;
        boolean foundWord2 = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!foundWord1 && text.indexOf(word1, i) != -1) {
                word1Index = i;
                foundWord1 = true;
            }
            if (!foundWord2 && text.indexOf(word2, i) != -1) {
                word2Index = i;
                foundWord2 = true;
            }
            
            if (foundWord1 && foundWord2) {
                break;
            }
        }

        if (word1Index != -1 && word2Index != -1) {
            String extractedText = text.substring(Math.min(word1Index, word2Index), 
                                   Math.max(word1Index, word2Index) + Math.max(word1.length(), 
                                   word2.length()));
            for (char ch : extractedText.toCharArray()) {
                if (ch != ' ') {
                    uniqueCharacters.add(ch);
                }
            }
        }

        return uniqueCharacters;
    }

    public static void main(String[] args) {
        String text = "Bu, algoritmayı gösteren örnek bir metindir.";
        String word1 = "örnek";
        String word2 = "algoritmayı";

        Set<Character> uniqueCharacters = findUniqueCharacters(text, word1, word2);

        System.out.println("Arasındaki benzersiz karakterler: '" + word1 + "' ve '" + word2 + "': " + uniqueCharacters);
    }
}
