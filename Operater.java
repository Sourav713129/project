import java.util.Scanner;
public class Operater
{
 public static void main(String [] args)
{  Scanner Input = new Scanner(System.in);
System.out.println("Enter a number");
int a =Input.nextInt();
int b=Input.nextInt();
int c=a+b;
int d=a-b;
int e=a*b;
float f=a/b;
System.out.println("Addition="+c);
System.out.println("Subtraction="+d);
System.out.println("Multiplication="+e);
System.out.println("Division="+f);
}
}