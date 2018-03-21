package javarush.test.level05.lesson05.task03;

/* Getters and setters for the class Dog
Create a class Dog. A dog must have a name - String name and age - int age.
    Create getters and setters for all the variables of the Dog class.
*/

public class Dog {
    protected String name;
    protected int age;

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}