/*
UCF COP3330 Summer 2021 Assignment 3 Exercise 46
*  Copyright 2021 Steven Ortiz
*/

//badger badger badger
//badger mushroom
//mushroom snake badger badger
//badger
//the program would produce the following output:
//
//badger:   *******
//mushroom: **
//snake:    *

package ex46;

import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ex46 {

    private static void wordCounter() throws IOException {

        //Scan file exercise46_input.txt
        //Use hash map

        int i1;
        int i2 = 0;
        String input;

        File file = new File("C:\\Users\\steven\\Desktop\\OOP\\Assignment 3\\exercise46_input.txt");
        Scanner s = new Scanner(file);
        HashMap<String, Integer> hashMap = new HashMap<>();

        //Split words and count occurrences

        while (s.hasNextLine()){

            input = s.nextLine();
            String[] list = input.split("\s+");

            for (String word : list) {

                if (hashMap.containsKey(word)) {
                    i1 = hashMap.get(word);
                    hashMap.put(word, i1 + 1); }

                else {
                    hashMap.put(word, 1);
                }
            }
        }

        //Print occurrences of each word to user

        for (Map.Entry<String, Integer> quantity : hashMap.entrySet()) {

            System.out.print(quantity.getKey() + " : ");

            for(i2 = 0; i2 < quantity.getValue(); i2++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        wordCounter();
    }
}
