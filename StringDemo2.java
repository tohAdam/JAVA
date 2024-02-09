public class StringDemo2 {
    public static void main(String[] args) {
        String str;
        int len;

        // Original string
        str = new String("Elementary, my dear Watson!");

        // Get the length of the original string
        len = str.length();
        System.out.println("Original string length: " + len);

        // Adding extra spaces on either side of the string
        str = "   " + str + "   ";
        len = str.length();
        System.out.println("String with extra spaces: " + len);

        // Adding more punctuation
        str = str + ",,,...";
        len = str.length();
        System.out.println("String with more punctuation: " + len);

        // Inserting a tab character
        str = str.replace("my", "\tmy");
        len = str.length();
        System.out.println("String with a tab character: " + len);
        
        // Changing the string entirely
        str = "MMMMMM";
        len = str.length();
        System.out.println("New string length: " + len);
        
        // Changing the string to "iiiiii"
        str = "iiiiii";
        len = str.length();
        System.out.println("Another string length: " + len);
    }
}
