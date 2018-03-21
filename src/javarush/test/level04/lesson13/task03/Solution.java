package javarush.test.level04.lesson13.task03;

/* Draw a triangle
Write a program that displays a right triangle composed of eights with sides 10 and 10. Use “for” loop.

    Example:
    8
    88
    888
    ...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String a = "";
        //       for (int i=0; i<=10; i++)
        //       {

        for (int j=0; j<=9; j++)
        {
            a = a + "8";
            System.out.println(a);
        }
        a = a + "8";

        //       }



    }
}