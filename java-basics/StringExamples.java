public class StringExamples
{
    public static void main (String a[])
    {
        // This is how everyone creates String
        String name1 = "Ragul";

        // Creating String with Object method
        String name = new String("Ragul");

        // adding two string using +
        System.out.println(name + " Kumar");

        // Adding two String using concat function
        System.out.println(name.concat(" Kumar"));

        // To check the character of the string using index value.
        System.out.println(name.charAt(1));

        // How string update & hold data
        String day = "wednesday";

        // Updating data, create a new object data in heap memory 
        // and old data goes to garbage collection.
        day = day + " holiday";

        // if a two variable has a two same object like wednesday here 
        // then both of them has one object location address and shared same reference for both.
        // It doesn't create a new object memory for same values
        String Day = "wednesday";

    }

}