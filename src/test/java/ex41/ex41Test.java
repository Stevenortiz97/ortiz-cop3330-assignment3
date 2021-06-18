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

        File namesReadTest = new File("C:\\Users\\Steven\\Desktop\\OOP\\Assignment 3\\exercise41_input.txt");
        Scanner testScanner = new Scanner(namesReadTest);
        List<String> namesListTest = new ArrayList<>();

        while(testScanner.hasNextLine()) {
            namesListTest.add(testScanner.nextLine());
        }
        testScanner.close();

        namesListTest.sort(String::compareToIgnoreCase);

        List<String> namesListActual = new ArrayList<>();

        namesListActual.add("Johnson, Jim");
        namesListActual.add("Jones, Aaron");
        namesListActual.add("Jones, Chris");
        namesListActual.add("Ling, Mai");
        namesListActual.add("Swift, Geoffrey");
        namesListActual.add("Xiong, Fong");
        namesListActual.add("Zarnecki, Sabrina");

        assertEquals(namesListTest,namesListActual);
    }
}
