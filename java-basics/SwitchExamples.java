import java.util.Scanner;

public class SwitchExamples {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        switch (fruit) {

            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;

            default:
                System.out.println("Enter a valid name.");

        }

        // Enchanced method
        // click alt + Enter button to use it.

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Enter a valid name.");
        }


    }
}
