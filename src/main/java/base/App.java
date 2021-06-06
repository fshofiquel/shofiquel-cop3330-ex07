/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

package base;

import java.util.Scanner;

public class App
{
    public static final double NUMBER = 0.09290304;
    public static void main(String[] args)
    {
        double length;
        double width;
        double solution;
        double metricSqr;
        String output;
        Scanner lenInput = new Scanner(System.in);
        Scanner widInput = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        length = lenInput.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        width = widInput.nextDouble();

        solution = length * width;
        metricSqr = solution * NUMBER;

        output = "The area is" +System.lineSeparator()+solution+
                "square feet" +System.lineSeparator()+metricSqr+
                "27.871 square meters";
        System.out.print(output);
    }
}
