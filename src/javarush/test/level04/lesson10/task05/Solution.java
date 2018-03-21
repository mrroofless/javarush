package javarush.test.level04.lesson10.task05;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1;
        int j = 1;
        while(i<=10)
        {
            while(j<=10)
            {
                System.out.print(i*j+" ");
                j++;
            }
            i++;
            System.out.println();
            j=1;
        }

    }
}