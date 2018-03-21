package javarush.test.level05.lesson09.task03;

/* Create a class Dog
Create a class Dog with three constructors:
    - Name
    - Name, height
    - Name, height, color
*/

public class Dog
{
    private int height;
    private String Name = null;
    private String color = null;
    public Dog(String Name) {
        this.Name = Name;
    }
    public Dog(String Name, int height) {
        this.Name = Name;
        this.height = height;
    }
    public Dog(String Name, int height, String color) {
        this.Name = Name;
        this.height = height;
        this.color = color;
    }
}
