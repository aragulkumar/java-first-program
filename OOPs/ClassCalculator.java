
class calculator
{
    // Here we have three different methods with same name 
    // But different parameters so this is called
    // Method Overloading

    public int add(int n1, int n2)
    {
        int tot = n1 + n2;

        return tot;
    }

    public int add(int n1, int n2, int n3)
    {
        int tot = n1 + n2 + n1;

        return tot;
    }

    public double add(double n1, int n2)
    {
        int tot = n1 + n2;

        return tot;
    }
}

public class ClassCalculator
{
    public static void main(String a[])
    {

        int num1 = 4;
        int num2 = 7;

        calculator calc = new calculator();

        int result = calc.add(num1,num2);

        // The class created is in a heap and from there we access the method. 
        // // The heap is stored as memory address in system.


        System.out.println(result); 

}
}
