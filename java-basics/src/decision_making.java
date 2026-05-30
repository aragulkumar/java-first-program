public class decision_making {
    public static void main(String[] args) {

        int n = 11;

        // if

        if (n > 0) {
            System.out.println("It is a Negative Integer");
        }

        // if else

        if (n % 2 == 0) {
            System.out.println("It is a Even Number");

        } else {
            System.out.println("It is a Odd Number");
        }

        // if else if

        if (n < 0) {
            System.out.println(" It is a positive Interger");
        } else if (n == 0) {
            System.out.println(" It is Zero");
        } else {
            System.out.println(" It is a Odd Interger");
        }


        // Switch Statement

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Its Monday");

            case 2:
                System.out.println("Its Tuesday");

            case 3:
                System.out.println(" Its Wednesday");

            default:
                System.out.println("Other Day");
        }
    }
}
