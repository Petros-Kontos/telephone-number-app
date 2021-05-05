package com.company;

import java.util.Arrays;

public class TelephoneNumber {

    public String processInput(String rawInput) {

        String inputWithSpacesRemoved = rawInput.replaceAll(" ", "");

        return validate(inputWithSpacesRemoved);

//      iterate();
    }

    public String validate(String input) {

        if (input.length() == 10) {
            if (input.substring(0, 1).equals("2") || input.substring(0, 2).equals("69")) {
                return input + " [phone number: VALID]";
            }
        } else if (input.length() == 14) {
            if (input.substring(0, 5).equals("00302") || input.substring(0, 6).equals("003069")) {
                return input + " [phone number: VALID]";
            }
        }

        return input + " [phone number: INVALID]";
    }

    public void iterate() {

        /*
        * This method is a possible starting point to solving the number interpretation problem.
        *
        * Note: we start from a "fully-compressed" position, i.e. with a version of the number that we can only add
        * digits to. If we are given a number that can have digits either removed or added, we can produce the "fully-
        * compressed" version and compute all iterations from that.
        *
        * The input string is divided into groups, separated by a space. One way would be to examine each group separa-
        * tely and determine the group-specific possible interpretations first. Then, we iterate across groups, as
        * shown below:
        */

        int[][] group1 = {
                {2}
        };
        int[][] group2 = {
                {10}
        };
        int[][] group3 = {
                {86}, {80, 6}
        };
        int[][] group4 = {
                {43}, {40, 3}
        };
        int[][] group5 = {
                {772}, {700, 72}, {700, 70, 2}
        };

        for (int[] i : group1) {
            for (int[] j : group2) {
                for (int[] k : group3) {
                    for (int[] l : group4) {
                        for (int[] m : group5) {
                            System.out.println(
                                    Arrays.toString(i) + " " +
                                            Arrays.toString(j) + " " +
                                            Arrays.toString(k) + " " +
                                            Arrays.toString(l) + " " +
                                            Arrays.toString(m)
                            );
                        }
                    }
                }
            }
        }
        /*
        * I can see 2 problems:
        *   1. Needing a new for loop for each group somehow seems really bad.
        *   2. I tried putting all groups into a single, triple-nested array. I struggled with finding a way to iterate
        *   through it.
        */
    }
}
