public class RepeatedLetters {
    public static void main(String[] args) {
        String text = "Bu 'saat' ve 'muhabbet' gibi tekrarlanan harflerden oluşan örnek bir metindir.";

        String[] words = text.split("\\s+"); 

        String word1 = null;
        String word2 = null;

        for (String word : words) {
            if (hasRepeatedLetters(word)) {
                if (word1 == null) {
                    word1 = word;
                } else {
                    word2 = word;
                    break;
                }
            }
        }

        if (word1 != null && word2 != null) {
            String combinedLetters = extractLetters(word1, word2);
            System.out.println("Birleştirilmiş kelimeler '" + word1 + "' ve '" + word2 + "': " + combinedLetters);
        } else {
            System.out.println("Tekrarlanan harflere sahip iki kelime bulunamadı.");
        }
    }

    private static boolean hasRepeatedLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static String extractLetters(String word1, String word2) {
        StringBuilder combinedLetters = new StringBuilder();

        for (char c : word1.toCharArray()) {
            if (!combinedLetters.toString().contains(String.valueOf(c))) {
                combinedLetters.append(c);
            }
        }
        for (char c : word2.toCharArray()) {
            if (!combinedLetters.toString().contains(String.valueOf(c))) {
                combinedLetters.append(c);
            }
        }
        return combinedLetters.toString();
    }
}
