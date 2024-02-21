public class SineTable {
    public static void main(String[] args) {
        System.out.printf("%-7s%-12s%n", "angle", "sine");
        System.out.println("-----    --------");
      
        for (double angle = -90.0; angle <= 90.0; angle += 15.0) {
            double sine = Math.sin(Math.toRadians(angle));
        System.out.printf("%5.1f%13.6f%n", angle, sine);
        }
    }
}
