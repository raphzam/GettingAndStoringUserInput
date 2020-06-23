import java.util.Scanner;

public class GettingAndStoringUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        DECLARING VARIABLES

        String firstName;
        String lastName;
        int houseNumber;
        String streetName;
        String streetType;
        String city;

//        GETTING INPUT
        System.out.println("First name:");
        firstName = input.nextLine();

        System.out.println("Last name:");
        lastName = input.nextLine();

        System.out.println("House number:");
        houseNumber = input.nextInt();
        input.nextLine();       //buffer


        System.out.println("Street name:");
        streetName = input.nextLine();

        System.out.println("Street type:");
        streetType = input.nextLine();

        System.out.println("City:");
        city = input.nextLine();

        System.out.println(firstName + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);


    }
}
