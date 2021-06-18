/*
 *  UCF COP3330 Summer 2021 Assignment 3 Exercise 41
 *  Copyright 2021 Steven Ortiz
 */
//Last      First     Salary
//--------------------------
//Ling      Mai       55900
//Johnson   Jim       56500
//Jones     Aaron     46000
//Jones     Chris     34500
//Swift     Geoffrey  14200
//Xiong     Fong      65000
//Zarnecki  Sabrina   51500

//pseudocode
//Read the txt file called "exercise42_input.txt"
//Split the first name, last name,, and salary
// print

package ex42;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex42 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Last      First      Salary");
        System.out.println("---------------------------");
        readFile();

    }

    private static void readFile() throws FileNotFoundException {

        Scanner s = new Scanner(new File("C:\\Users\\Steven\\Desktop\\OOP\\Assignment 3\\exercise42_input.txt"));
        ArrayList<String> list = new ArrayList<String>();

        while(s.hasNext()){
            String[] tokens = s.nextLine().split(",");
            //String last = tokens[tokens.length - 1];
            System.out.println(list);
        }


    }
}