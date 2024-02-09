public class StringT {
    public static void main(String[] args) {
        String original = new String("    In a Hole    in the ground there lived a Hobbit.   ");
        String trimmed;

        // Call trim() method to create a new String with leading and trailing spaces trimmed
        trimmed = original.trim();

        // Print both original and trimmed Strings
        System.out.println("Original string: \"" + original + "\"");
        System.out.println("Trimmed string:  \"" + trimmed + "\"");
    }
}
