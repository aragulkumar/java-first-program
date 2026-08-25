class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " " + price + " " + name);
    }
}

public class Static
{
    public static void main (String a[])
    {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        
        // When we calling Static variable, use class name because it is standard practice
        obj.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1300;
        
        // Don't use like this
        obj2.name = "Phone";

        obj.show();
        obj2.show();



    }

}