class Human
{ 
    // we make our variable private and only way to access them through only METHODS
    private int age=11;
    private String name;

    // We use public to access the data.
    public int getAge()
    { 
        return age;
    }

    public String getName()
    {
        return name;
    }

    // for showing we return values but for setting we should use void
    public void setName(String n)
    { 
        name = n;
  
    }

    public void setAge(int a)
    {
        age = a;
    }
}

public class Encapsulation
{
    public static void main (String a[])
    {
        // we are binding our data and we can only access them by methods
        // So no one from outside can directly access your variables.
        Human obj = new Human();

        // Setting variable values by method
        obj.setName("RK");

        // Printing values by getting values from method
        System.out.println(obj.getName() + " : " + obj.getAge());

    }

}