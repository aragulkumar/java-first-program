
class calculator
{
    public int add(int n1, int n2)
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

        System.out.println(result); 

}
}
