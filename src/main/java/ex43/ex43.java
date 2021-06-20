/*
 *  UCF COP3330 Summer 2021 Assignment 3 Exercise 43
 *  Copyright 2021 Steven Ortiz
 */

//Site name: awesomeco
//Author: Max Power
//Do you want a folder for JavaScript? y
//Do you want a folder for CSS? y
//Created ./website/awesomeco
//Created ./website/awesomeco/index.html
//Created ./website/awesomeco/js/
//Created ./website/awesomeco/css/

//pseudocode
// ask for the website information
// store user responses
// generate index.html file

package ex43;

import java.io.*;
import java.util.Scanner;
public class ex43 {

    public static void makeWebsite () {


        Scanner s = new Scanner(System.in);

        String path, author, name;

        char javaScript = 'N';

        char css = 'N';

        System.out.print("What is the name of the website? ");

        name = s.nextLine();

        System.out.print("Who is the author of the website? ");

        author = s.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");

        javaScript = s.next().charAt(0);

        System.out.print("Do you want a folder for CSS? ");

        css = s.next().charAt(0);

        path = System.getProperty("user.dir");

        path += "\\" + name;
        File website = new File(path);
        boolean website1 = website.mkdir();
        while (website1) {
            System.out.println("Created " + path);
            try {
                FileWriter output = new FileWriter(new File(path + "\\index.html"));

                output.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");

                output.write("\t<meta author=\"" + author + "\">\n");

                output.write("\t<title>" + name + "</title>\n");

                output.write("</head>\n<body>\n\n</body>\n</html>");

                output.close();

                System.out.println("Created " + path + "\\index.html");

                if (javaScript == 'y') {
                    File javaScriptFile = new File(path + "\\javaScript");
                    boolean javaScript1 = javaScriptFile.mkdir();
                    if (javaScript1) {
                        System.out.println("Created " + javaScriptFile + "\\");
                    }

                }

                if (css == 'y') {
                    File cssFile = new File(path + "\\css");
                    boolean cssFile1 = cssFile.mkdir();
                    if (cssFile1) {
                        System.out.println("Created " + cssFile + "\\");
                    }

                }
            } catch (IOException e) {
                System.out.println("index.html not created as required!!");
            }
            break ;
        }
    }

    public static void main(String[] args) {

        makeWebsite();
    }

}
