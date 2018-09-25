/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade12examples;

import java.util.Scanner;

/**
 *
 * @author tarra7926
 */
public class Grade11Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A scanner for user input
        Scanner input = new Scanner(System.in);
        //print instructuib to user
        System.out.println("Please enter your name");
        //store the user's name
        String name = input.nextLine();
        System.out.println("Hello " + name);

        // get the user's birth year
        System.out.println("please enther the year you were born.");

        int birthYear = input.nextInt();
        int userAge = 2018 - birthYear;

        System.out.println("Your age is " + userAge);

        if (userAge <= 0) {
            System.out.println("Did you invent a time machine");
        } else if (userAge > 0 && userAge < 5) {
            System.out.println("ur a baby");
        } else {
            System.out.println("uh");
        }
        System.out.println("Please enter a number between one and 10");
        int num = input.nextInt();
        int count = 0;
        while (count < num) {
            count++;
            System.out.println(count);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
 
        //array of random integers
        int[] randomNums = new int[10];
        randomNums[0] = (int) (Math.random() * 100 + 1);
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int)(Math.random() * 100 + 1);    
        }
        int sum = 0;
        for (int i = 0; i < randomNums.length; i++) {
            sum = sum + randomNums[i];            
        }
        int avg = sum/randomNums.length;
    }
}
