public class Student {
int m1,m2,m3;
public Student(int a, int b, int c) {
this.m1 = a;
this.m2 = b;
this.m3 = c;
}
public void print()
{
System.out.println("mark of first subject "+m1);
System.out.println("mark of second subject "+m2);
System.out.println("mark of third subject "+m3);
}
public void sum()
{
int sum=m1+m2+m3;
System.out.println("sum is"+sum);
}
public static void main(String[] args) {
Student s1=new Student(10,20,30);
Student s2=new Student(50,40,30);
s1.print();
s1.sum();
}
}