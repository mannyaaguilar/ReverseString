package com.manny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Create a Java Program that takes a String value, and prints the reverse of the String.
	There are two ways to do this:
	1. Using customized logic.
	2. Using standard Java API
	*/

	//Method one will require 2 String objects.
        String original; //for storing user input
        String rev = ""; // for storing the reverse of the String

        System.out.println("Enter String to reverse : ");
        Scanner sc = new Scanner(System.in);

        original = sc.nextLine();

//        int len = original.length();
//        for(int i = len -1; i>=0; i--)
//            rev = rev + original.charAt(i);


    //Method two using standard JAVA API and object StringBuffer
        StringBuffer sb = new StringBuffer(original);
        rev = sb.reverse().toString();

            System.out.println("Original String value is : " + original);
            System.out.println("Reverse of String value is : " + rev);



    }
}
