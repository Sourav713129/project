import java.util.Scanner;
public class Swap{
public static void main(String[] args)
{
 Scanner I = new Scanner(System.in);
System.out.println("Enter two number");
int a =I.nextInt();
int b=I.nextInt();
System.out.println("Before Swap a="+a+ "b="+b);
int temp=a;
a=b;
b=temp;
System.out.println("After Swap a="+a+ "b="+b);
}
}