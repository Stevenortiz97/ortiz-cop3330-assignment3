/*
UCF COP3330 Summer 2021 Assignment 3 Exercise 45
*  Copyright 2021 Steven Ortiz
*/

//One should never utilize the word "utilize" in writing. Use "use" instead.
//For example, "She uses an IDE to write her Java programs" instead of "She
//utilizes an IDE to write her Java programs".
//The program should generate
//
//One should never use the word "use" in writing. Use "use" instead.
//For example, "She uses an IDE to write her Java programs" instead of "She
//uses an IDE to write her Java programs".


package ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex45 {

    public static void main(String[] args) throws IOException {

        makeFile();

    }

    private static void makeFile() throws IOException {

        //Scan exercise45_input.txt

        File file = new File("C:\\Users\\steven\\Desktop\\OOP\\Assignment 3\\exercise45_input.txt");
        Scanner s = new Scanner(file);
        Scanner s1 = new Scanner(System.in);

        //Prompt user for name of output file

        System.out.print("Enter a name for the output file: ");

        String userFile = s1.next();

        //Create custom named file

        FileWriter wordChange = new FileWriter("C:\\Users\\steven\\Desktop\\OOP\\Assignment 3\\"+userFile+".txt");

        //Replace all cases of utilize with use

        try
        {

            while( s.hasNext() )
            {

                String input = s.nextLine();
                input = input.replaceAll("utilize", "use");
                wordChange.write(input);
                wordChange.write("\n");
            }
        }
        finally
        {
            s.close();
        }
        wordChange.close();
    }

    }
