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

    public static void main(String[] args) throws IOException {
        wordCounter();
    }

    private static void wordCounter() throws IOException {
        int count;
        String input;

        File file = new File("C:\\Users\\steven\\Desktop\\OOP\\Assignment 3\\exercise46_input.txt");
        Scanner s = new Scanner(file);
        HashMap<String, Integer> map = new HashMap<>();

        while (s.hasNextLine()){
            input = s.nextLine();
            String[] list = input.split("\s+");

            for (String word : list) {
                if (map.containsKey(word)) {
                    count = map.get(word);
                    map.put(word, count + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " : ");
            for(int i = 0; i < entry.getValue(); i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
