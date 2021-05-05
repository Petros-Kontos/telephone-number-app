package com.company;

import java.sql.SQLOutput;

public class TelephoneNumberTest {

    private String[][] inputOutputExamples = {
            {"210 94 86 478", "2109486478 [phone number: VALID]"},
            {"210 94 86 478 3456", "21094864783456 [phone number: INVALID]"},
            {"0030 210 94 86 478", "00302109486478 [phone number: VALID]"},
            {"69 79 48 37 49", "6979483749 [phone number: VALID]"},
            {"00 30 69 79483 749", "00306979483749 [phone number: VALID]"},
            {"23 546","23546 [phone number: INVALID]"},
            {";fa slk jf;iaj",";faslkjf;iaj [phone number: INVALID]"}
    };

    public void processInputTest() {

        for (int i = 0; i<inputOutputExamples.length; i++ ) {

            TelephoneNumber telephoneNumber = new TelephoneNumber();

            if (telephoneNumber.processInput(inputOutputExamples[i][0]).equals(inputOutputExamples[i][1])) {
                System.out.println("Test case " + i + " succeeded");
            } else {
                System.out.println("Test case " + i + " failed");
            }
        }
    }
}
