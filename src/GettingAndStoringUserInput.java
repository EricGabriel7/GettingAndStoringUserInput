//Importing scanner utility
import java.util.Scanner;

//Declaring class
public class GettingAndStoringUserInput {
    //Declaring main method
    public static void main(String[] args){
        //Adding necessary component for using Scanner utility
        System.out.println("Please enter in your first initial: ");
        Scanner keyboard = new Scanner(System.in);
        //String Input = "P SHERMAN 42 WALLABY WAY SYDNEY";
        String firstInitial = keyboard.next();
        System.out.println(firstInitial);
        //Prompting user to enter last name
        System.out.println("Please enter your last name: ");
        //Defining what user types in as String variable lastName
        String lastName = keyboard.next();
        //printing out variable lastName
        System.out.println(lastName);
        //Prompts user to enter house number
        System.out.println("Please enter in your house number: ");
        //Defines user input as string variable houseNumber
        String houseNumber = keyboard.next();
        //Displays user input houseNumber on console
        System.out.println(houseNumber);
        //Prompts user to enter street name
        System.out.println("Please enter in your street name: ");
        //Defines user input as string variable streetName
        String streetName = keyboard.next();
        //Displays user input houseNumber on console
        System.out.println(streetName);
        //Prompts user to enter street type
        System.out.println("Please enter in your street type: ");
        //Defines user input as string variable streetType
        String streetType = keyboard.next();
        //Displays user input houseNumber on console
        System.out.println(streetType);
        //Prompts user to enter city
        System.out.println("Please enter in your city: ");
        //Defines user input as string variable city
        String city = keyboard.next();
        //Displays user input city on console
        System.out.println(city);
        }
}
