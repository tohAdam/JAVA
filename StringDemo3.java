public class StringDemo2 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled."); // Create the original object

        // Experiment with substring() method
        String sub1 = str.substring(8, 19); // Create a new object from the original
        String sub2 = str.substring(0, str.length()); // Same as str.substring(0, 28)
        String sub3 = str.substring(0, 29); // Same as str.substring(0, 29)
        String sub4 = str.substring(-1, 10); // First parameter negative
        String sub5 = str.substring(10, 5); // Reverse the order of parameters

        // Print results
        System.out.println("Original string: \"" + str + "\"");
        System.out.println("Substring (8, 19): \"" + sub1 + "\"");
        System.out.println("Substring (0, str.length()): \"" + sub2 + "\"");
        System.out.println("Substring (0, 29): \"" + sub3 + "\"");
        System.out.println("Substring (-1, 10): \"" + sub4 + "\""); // This will throw an exception
        System.out.println("Substring (10, 5): \"" + sub5 + "\""); // This will throw an exception
    }
}
