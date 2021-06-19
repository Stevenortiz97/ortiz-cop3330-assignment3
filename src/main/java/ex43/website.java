/*
 *  UCF COP3330 Summer 2021 Assignment 3 Exercise 42
 *  Copyright 2021 Steven Ortiz
 */

package ex43;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
public class website {

    private static final Scanner in = new Scanner(System.in);


    public static void createSite() throws IOException {

        String html = "<div><h1>name</h1><p>hello</p></div>";
        File f = new File ("C:\\Users\\Steven\\Desktop\\OOP\\Assignment 3\\index.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(html);
        bw.close();

    }
}
