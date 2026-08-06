public class StringBuffer
{
    public static void main (String a[])
    {
        // It is like string but it is mutable
        StringBuffer sb = new StringBuffer("Ragul");

        // can append string
        sb.append("Kumar");

        // can Insert string
        sb.insert(0,"A ");

        // Can able to set length limit.
        sb.setLength(30);



    }

}