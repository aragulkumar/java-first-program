import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        // THIS IS MY FIRST JAVA PROJECT

        /*
        HELLO IT IS DEMO MULTILINE COMMAND
         */

//        System.out.print("I like Bolli! \n");
//        System.out.print("Its really sweet \n");
//        System.out.print("Buy me one");
//        System.out.println();


        /*
        -------------------------------------
        Java has 2 type of variables
        - Primitive
        - Reference
        ------------------------------------------------
        Primitive has int, boolean, char, double
        Reference has string, array, object
        -------------------------------------------
        2 Steps to create variables
        -------------------------------------------
        - 1) Declaration
        - 2) Assignment

         */
//        int age=19;
//        System.out.println(age);
//
        int year=2025;
//        System.out.println("The year is " + year);
//
        double price = 20000000.40;
        double cgpa = 8.5;
        double temperature = 2.5;
//
//        System.out.println("$" + price);
//
//
        char grade = 'A';
        char Symbol = '!';
        char currency = '$';
//
//        System.out.println("Currency" + currency);
//
        boolean isStudent = true ; // camelCase - when two letter in a variable
        boolean forSale = true;
        boolean isOnline = true;
//
//        System.out.println(isOnline);
//
//        if(isStudent) {
//
//            System.out.println("You are a student!");
//        }
//
//        else {
//            System.out.println("You are NOT a student!");


        // Reference - String

        String name = "Ragul Kumar A";
        String fruit = "Apple";
        String email = "fakeid123@gmail.com";
        String car = "Benz";
        String color = "Black Color";

//        System.out.println("Hello " + name);
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The Price is " + currency + price);


        if(forSale){
            System.out.println("There is a " + car + " for sale");

        }
        else{
            System.out.println("The " + car + " is not for sale");
        }




    }

    }
