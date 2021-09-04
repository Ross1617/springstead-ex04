/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 04
 *  Copyright 2021 Ross Springstead
 */
/*
    prompt the user for a noun
    set noun1 to the user input
    prompt the user for a verb
    set verb1 to the user input
    prompt the user for an adverb
    set adverb1 to the user input
    prompt the user for a noun
    set noun2 to the user input
    prompt the user for a verb
    set verb2 to the user input
    prompt the user for an adjective
    set adjective1 to the user input
    prompt the user for a noun
    set noun3 to the user input
    use printf to print the collection of variables



 */

import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Hey give me a noun\n");
        String noun1 = input.nextLine();

        System.out.printf("Hey give me an adverb\n");
        String adverb1 = input.nextLine();

        System.out.printf("Hey give me a verb\n");
        String verb1 = input.nextLine();

        System.out.printf("Hey give me a noun\n");
        String noun2 = input.nextLine();

        System.out.printf("Hey give me another verb\n");
        String verb2 = input.nextLine();

        System.out.printf("Hey give me an adjective\n");
        String adjective1 = input.nextLine();

        System.out.printf("Hey give me another noun\n");
        String noun3 = input.nextLine();

        System.out.printf("%s %s %s to the %s and %s to the %s %s.",noun1, adverb1, verb1, noun2, verb2, adjective1, noun3  );
    }
}
