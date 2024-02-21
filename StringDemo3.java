public class StringDemo3 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled."); 
        String sub = str.substring(8, 19); 

        System.out.println(sub);
    }
}
//q1
public class StringDemo3 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled."); 
        String sub = str.substring(8, 8); 

        System.out.println(sub);
    }
}
//q2
public class StringDemo3 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled."); 
        String sub = str.substring(0, str.length()); 

        System.out.println(sub);
    }
}
//q3
public class StringDemo3 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled.");
        String sub = str.substring(0, str.length()); 

        System.out.println("Substring: \"" + sub + "\"");
        System.out.println("Length of substring: " + sub.length());
    }
}
//q4
public class StringDemo3 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled.");
        String sub = str.substring(0, 29); 

        System.out.println("Substring: \"" + sub + "\"");
        System.out.println("Length of substring: " + sub.length());
    }
}
//q5
public class StringDemo3 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled.");
        String sub = str.substring(-1, 29); 

        System.out.println("Substring: \"" + sub + "\"");
        System.out.println("Length of substring: " + sub.length());
    }
}
//q6 
public class StringDemo3 {
    public static void main(String[] args) {
        String str = new String("Golf is a good walk spoiled."); 
        String sub = str.substring(29, 0); 

        System.out.println("Substring: \"" + sub + "\"");
        System.out.println("Length of substring: " + sub.length());
    }
}


