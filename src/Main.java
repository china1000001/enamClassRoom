import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days = scanner.nextLine();
        switch (days) {
            case "monday":
                System.out.println(DAY.MONDAY);
                break;
            case "tuestay":
                System.out.println(DAY.TUESDAY);
                break;
            case "wednesday":
                System.out.println(DAY.WEDNESDAY);
                break;
            case "thursday":
                System.out.println(DAY.THURSDAY);
                break;
            case "friday":
                System.out.println(DAY.FRIDAY);
                break;
            default:
        }
    }
}