package javarush.test.level04.lesson02.task05;

public class Solution {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        cat1.addNewCat();

        Cat cat2 = new Cat();
        cat2.addNewCat();

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
        public void addNewCat()
        {
            this.count = count +1;
        }
    }
}
