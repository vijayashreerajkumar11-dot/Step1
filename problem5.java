public class problem5 {
    // Method to classify word lengths
    static void classifyWordLengths(String review) {

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        // Split review into words
        String[] words = review.split(" ");

        // Check each word length
        for (int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length >= 1 && length <= 4) {
                shortCount++;
            } 
            else if (length >= 5 && length <= 8) {
                mediumCount++;
            } 
            else {
                longCount++;
            }
        }

        // Print result
        System.out.println("Short: " + shortCount
                + " | Medium: " + mediumCount
                + " | Long: " + longCount);
    }

    public static void main(String[] args) {

        String review = "This movie was absolutely fantastic and thrilling";

        classifyWordLengths(review);
    }
}
