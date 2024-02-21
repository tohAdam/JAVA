import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.println("Enter your age in years:");
        int years = scanner.nextInt();

     System.out.println("Enter your age in months:");
        int months = scanner.nextInt();

     System.out.println("Enter your age in days:");
        int days = scanner.nextInt();
        int totalDays = years * 365 + monthsToDays(months) + days;
        long ageInSeconds = totalDays * 24 * 60 * 60;
        long expectedLifespan = 2500000000L;
        double percentageLived = (ageInSeconds / (double) expectedLifespan) * 100;

     System.out.println("Your age in seconds: " + ageInSeconds);
     System.out.printf("You have lived %.2f%% of your expected lifespan.\n", percentageLived);
    }

    public static int monthsToDays(int months) {
        int days = 0;
        switch (months) {
            case 12:
                days += 31;
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days += 31;
            case 2:
                days += 28; // assuming non-leap year
            case 1:
                days += 31;
                break;
            default:
                break;
        }
        return days;
    }
}
