package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input: ");
        String input = in.nextLine();
        input = input.replaceAll("\\s+", "");

        try{
            double result = Reader.Check(input);

            System.out.println("Output:");
            System.out.println(result);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
