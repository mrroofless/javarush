package javarush.test.level04.lesson06.task04;

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1= reader.readLine();
        String name2= reader.readLine();
        if(name1.equals(name2))
        {
            System.out.println("Names are identical");
        }
        else if (name1.length()==name2.length())
        {
            System.out.println("Name lengths are equal");
        }

    }
}
