/*
    UCF COP3330 Fall 2021 Assignment 6 Solution
    Copyright 2021 Luke Faulkner
 */

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        // Variables / Objects
        Scanner readYear = new Scanner(System.in);
        String currentAgeStr, retirementAgeStr;
        int currentYear, retirementYear, yearsUntilRetirement;

        // Prompt
        System.out.print("What is your current age? ");
        currentAgeStr = readYear.nextLine();

        System.out.print("At what age would you like to retire? ");
        retirementAgeStr = readYear.nextLine();

        // Calc for Output
        int currentAge = Integer.parseInt(currentAgeStr);
        int retirementAge = Integer.parseInt(retirementAgeStr);
        currentYear = Year.now().getValue();
        yearsUntilRetirement = retirementAge - currentAge;
        retirementYear = currentYear + yearsUntilRetirement;

        // Output
        System.out.println("You have " + yearsUntilRetirement + " years left until you can retire.");
        System.out.print("It's " + currentYear + ", so you can retire in " + retirementYear + ".");
    }
}
