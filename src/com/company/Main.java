package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner type = new Scanner(System.in);
        System.out.println("Who dafuq is this?");
        String firstName = type.nextLine();
        System.out.println(firstName + " who?");
        String lastName =  type.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);
        newWhileLoop();
        //howMuchOoman();
    }
    //private static void howMuchOoman(){
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("How much ooman u have?");
        //int count = scanner.nextInt();
        //if (count > 10){
          //  System.out.println("wul leap a ooman");
        //} else
          //  {System.out.print("Get more ooman");}

        //System.out.print(2018 - count); // must use scanner.nextInt to be able to call the intAge variable and use mathematical functions w it


    //}
    private static void newWhileLoop(){
        Scanner scanner = new Scanner(System.in); // Creating scanner object
        int favoriteNumber = 99;
        int guess = 0; // initializing the guess as 0 and as long as guess does not equal 99 while loop will run
        while (guess != 99){
            System.out.println("What is my favorite number?");
            guess = scanner.nextInt(); // saves the user input under the guess variable
         if (guess == favoriteNumber){
             System.out.println("You guessed correct."); // if user input equals 99 print you got it
             break;
         }  else if(guess == 12){
             System.out.println("FUCK 12");
         }else{
             System.out.println("Try Again");
         }
        }
    }
}


    //String musician = "Louis Armstrong";
    //char lastLetter =  musician.charAt(musician.length() - 1);  * this returns the same value
    //int indexOf = musician.indexOf("g");
    //char lastLetter =  musician.charAt(indexOf);
      //  System.out.println(lastLetter);



