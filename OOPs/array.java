public class array
{
    public static void main (String a[])
    {
        // Creating a array with values
        int nums[] = {11,9,5,6};

        // If we don't have a value 
        // need to create it for future use
        // int[4] is a predefined array so you can only add 4 values.
        int nums1[] = new int[4];

        // You can print values from the array by using index values.
        // array index starts from 0.
        System.out.println(nums[0]);

        // Changing a value in a array.
        nums[1] = 5;

        // creating a for loop to print array elements
        for (int i=0;i<4;i++)
        {
            System.out.println(nums[i]);
        }
    }
}