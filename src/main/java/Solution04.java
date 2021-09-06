/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution04 {
/*
get 4 inputs from user
-noun,verb,adjective,adverb-
store in to strings
output all the strings into sentence
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noun, verb, adjective, adverb;

        System.out.println("Enter a noun: ");
        noun = input.nextLine();

        System.out.println("Enter a verb: ");
        verb = input.nextLine();

        System.out.println("Enter a adjective: ");
        adjective = input.nextLine();

        System.out.println("Enter a adverb: ");
        adverb = input.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
