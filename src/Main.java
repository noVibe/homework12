import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //=====Task 1=====
        System.out.println("=====Task 1=====");
        System.out.println(LeapOrNot(2400));
        //=====Task 2=====
        System.out.println("=====Task 2=====");
        AppForCurrentDevice();
        //=====Task 3=====
        System.out.println("=====Task 3=====");
        System.out.println("Delivery days: " + DaysForDelivery(95));


    }
    public static String LeapOrNot(int year){
        String result = year + " is a non-leap year";
        if (year % 100 == 0 ^ year % 4 == 0) {
            result = year + " is a leap year";
        }
        return result;
    }

    public static void AppForCurrentDevice(){
        for (;;) {
            System.out.print("Choose your platform (0 for Android, 1 for iOs): ");
            Scanner scanner = new Scanner(System.in);
            int platform = scanner.nextInt();
            System.out.print("Enter production year: ");
            int manufactureYear = scanner.nextInt();
            int currentYear = LocalDate.now().getYear();
            if (manufactureYear > currentYear || !(platform >= 0 && platform <= 1)) {
                System.out.println("!!! Invalid data, please enter correctly !!!");
            } else {
                String currentPlatform = platform == 0 ? "Android" : "iOS";
                String lightAppOrNot = manufactureYear < currentYear ? "Light" : "Full";
                System.out.printf("Install %s %s app\n", lightAppOrNot, currentPlatform);
                scanner.close();
                break;
            }
        }
    }
    public static int DaysForDelivery(int deliveryDistance) {
        return 1 + (deliveryDistance + 20) / 40;
    }

}