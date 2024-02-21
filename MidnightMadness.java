import java.util.Scanner;

public class MidnightMadness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.println("Enter your age:");
        int age = scanner.nextInt();

     System.out.println("Enter the time (24-hour clock):");
        int time = scanner.nextInt();
        double ticketPrice;
      if (time >= 2200) { 
            if (age > 13) { 
                ticketPrice = 4.00;
            } 
          else { 
                System.out.println("Children are not allowed to purchase tickets after 10:00 PM.");
                return;
            }
        } else { 
            if (age > 13) { 
                if (time < 1700) { 
                    ticketPrice = 5.00;
                } else { 
                    ticketPrice = 8.00;
                }
            } 
          else { 
                if (time < 1700) { 
                    ticketPrice = 2.00;
                } 
            else { 
                    ticketPrice = 4.00;
                }
            }
        }
        System.out.println("Ticket price: $" + ticketPrice);
    }
}
