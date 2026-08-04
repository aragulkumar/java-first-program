public class array
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



    }

}