/*
 *  UCF COP3330 Summer 2021 Assignment 3 Exercise 42
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

import java.io.IOException;
import java.util.Scanner;

public class ex43 {

    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        //promptUser();

        website wg = new website();
        website.createSite();

    }

    public static void promptUser() {

        System.out.print("What is the name of your website? ");
        String name = in.nextLine();

        System.out.print("Who is the author of your website? ");
        String author = in.nextLine();

        System.out.print("Do you want a folder for JavaScript files? ");
        String javaScript = in.nextLine();

        System.out.print("Do you want a folder for CSS files? ");
        String css = in.nextLine();

    }




}