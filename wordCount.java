public class wordCount {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean isWord = false;

        for (char c : input.toCharArray()) 
        {
            
            if (Character.isLetterOrDigit(c)) {
                if (!isWord) {
                    
                    isWord = true;
                    wordCount++;
                }
            } else {
                
                isWord = false;
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String st = "Hello World I am 6";
        int wordCount = countWords(st);
        System.out.println("Number of words: " + wordCount);
    }
}