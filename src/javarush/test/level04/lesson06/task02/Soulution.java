package javarush.test.level04.lesson06.task02;

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int a = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int b = Integer.parseInt(num2);
        String num3 = reader.readLine();
        int c = Integer.parseInt(num3);
        String num4 = reader.readLine();
        int d = Integer.parseInt(num4);
        if (a > b && a > c && a > d)
            System.out.println(a);
        if (b > a && b > c && b > d)
            System.out.println(b);
        if (c > b && c > a && c > d)
            System.out.println(c);
        if (d > b && d > c && d > a)
            System.out.println(d);

    }
}

