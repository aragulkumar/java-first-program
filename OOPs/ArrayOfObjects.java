class Student
{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects
{
    public static void main (String a[])
    {

        Student s1 = new Student();
        s1.rollno = 11;
        s1.marks= 95;
        s1.name="Ragul";

        Student s2 = new Student();
        s2.rollno = 105;
        s2.marks= 97;
        s2.name="Vishnu";

        Student s3 = new Student();
        s3.rollno = 85;
        s3.marks= 98;
        s3.name="Sheron";

        Student Students[] = new Student[3];
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;

        for (int i=0;i<Students.length;i++)
        {
            System.out.println(Students[i].name + Students[i].marks);
        }



    }

}