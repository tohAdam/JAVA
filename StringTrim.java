public class StringTrim {
    public static void main(String[] args) {
        String original = new String("    In a Hole    in the ground there lived a Hobbit.   ");
        String trimmed;

        trimmed = original.trim();

        System.out.println("Original string: \"" + original + "\"");
        System.out.println("Trimmed string: \"" + trimmed + "\"");
    }
}
