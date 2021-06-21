/*
 *  UCF COP3330 Summer 2021 Assignment 3 Exercise 41
 *  Copyright 2021 Steven Ortiz
 */

//Total of 7 names
//-----------------
//Johnson, Jim
//Jones, Aaron
//Jones, Chris
//Ling, Mai
//Swift, Geoffrey
//Xiong, Fong
//Zarnecki, Sabrina

package ex41;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class ex41 {

    private static int i = 0;

    private static List readFile() throws FileNotFoundException {

        //Read the txt file called "exercise41_input.txt"

        Scanner s = new Scanner(new File("C:\\Users\\Steven\\Desktop\\OOP\\Assignment 3\\exercise41_input.txt"));
        ArrayList<String> list = new ArrayList<String>();

        //Create a list of names from the file

        while (s.hasNextLine()) {
            list.add(s.nextLine());
            i ++;
        }
        s.close();

        //Organize the names in order into a new list

        return Arrays.asList(
                list.stream().sorted(String::compareToIgnoreCase).toArray(String[]::new)
        );
    }

    private static void createFile(List<String> list) throws FileNotFoundException {

        PrintWriter write = new PrintWriter("C:\\Users\\Steven\\Desktop\\OOP\\Assignment 3\\exercise41_output.txt");

        //count the number of names

        write.println("Total of "+ i +" names");
        write.println("-----------------");

        //print alphabetical list into "exercise41_output.txt"

        for(Object o : list)
            write.println(o);

        write.close();
    }
    public static void main(String[] args) throws FileNotFoundException {

        List sorted = readFile();

        createFile(sorted);

    }
}




