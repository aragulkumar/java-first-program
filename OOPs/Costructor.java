class Human
{ 
    private int age;
    private String name;

    // We Use constructor like a method
    // Constructor should have the same name as class.
    // When we executed our program, the constructor will get first executed
    // For standard method, we use method for every function so we don't add values directly when we create variables

    public Human()
    { 
        age = 11;
        name = "Ragul";
    }
    public int getAge()
    { 
        return age;
    }
   
    public String getName()
    {
        return name;
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

public class ThisMethod
{
    public static void main (String a[])
    {
        Human obj = new Human();

        System.out.println(obj.getName() + " : " + obj.getAge());

    }

}