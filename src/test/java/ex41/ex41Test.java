package ex41;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ex41Test {

    @Test
    void main() throws FileNotFoundException {

        File file = new File("C:\\Users\\Steven\\Desktop\\OOP\\Assignment 3\\exercise41_input.txt");

        Scanner s = new Scanner(file);

        List<String> list = new ArrayList<>();

        while(s.hasNextLine()) {

            list.add(s.nextLine());
        }

        s.close();

        list.sort(String::compareToIgnoreCase);

        List<String> listNew = new ArrayList<>();

        listNew.add("Johnson, Jim");

        listNew.add("Jones, Aaron");

        listNew.add("Jones, Chris");

        listNew.add("Ling, Mai");

        listNew.add("Swift, Geoffrey");

        listNew.add("Xiong, Fong");

        listNew.add("Zarnecki, Sabrina");

        assertEquals(list,listNew);
    }
}
