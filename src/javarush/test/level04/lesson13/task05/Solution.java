package javarush.test.level04.lesson13.task05;

import java.io.*;
import java.util.Scanner;
/* Everybody loves somebody
Write a program that reads from keyboard name. Use “for” loop to display 10 times the text:
    «name» loves me.

    Example text:
    Pam loves me.
    Pam loves me.
    …
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (int i=1; i<=10; i++)
        {
            System.out.println(name +  " loves me.");
        }

    }
}
