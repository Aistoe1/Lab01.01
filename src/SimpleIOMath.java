/**
 * Basic Input-Output conversation with the user
 * @author 27gunscha
 * @version 09.23.2026
 * FLINT SESSIONS: https://app.flintk12.com/activities/units-1-parts-a-55b1e5/sessions/a67e19ac-4e2f-41b4-8c6c-bc34cf21a368
 */

import java.util.Scanner;

public class SimpleIOMath {

    private String name;
    private int age;
    private int favNumber;

    private boolean isPrime(int num) {
        if (num <2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++)     {
            if(num % i==0)
                return false;
        }
        return true;
    }

    private int findFirstPrimeFactor(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(isPrime(i) && num % i==0)
                return i;
        }
        return num;
    }

    /**
     * This method just asks the questions
     * Checks to see if they are valid
     * If they aren't it will reprompt the user to enter a valid number
     * Also stores the user input into its respective field
     * */

    public void promptUser() {
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        while(!validInput)
        {
            try {
                System.out.print("Question 2: How old are you? ");
                age = in.nextInt();
                if (age < 2)
                    throw new Exception();
                validInput = true;
            } catch (Exception e) {
                System.out.println("That's not a valid age");
                System.out.println("Details here: " + e.toString());
                in.nextLine();
            }
        }
        validInput=false;
        while(!validInput) {
            try {
                System.out.print("Question 3: What is your favorite number? ");
                favNumber = in.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("That's not a valid number");
                System.out.println("Details here: " + e.toString());
                in.nextLine();
            }
        }
    }

    /**
     * This method prints the given values
     * Also manipulates the values as needed
     */

    public void printInfo(){
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: "+ age);
        System.out.println("At your next birthday, you will turn "+ (age + 1)+".");
        System.out.println("The first prime factor of " + (age) + " is: " + findFirstPrimeFactor(age)+".");
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + favNumber*favNumber);
        System.out.println("If you are currently " + age + " years old, then you were born in " + (2026-age)+".");
        System.out.println("* end of program *");
    }

    /**
     * Main method for class SimpleIOMath
     * @param args Command line arguments, if needed
     */

    public static void main(String[] args){
        SimpleIOMath obj = new SimpleIOMath ();
        obj.promptUser();
        obj.printInfo();
    }

}
