import java.util.Scanner;
class Square
{
	public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int a=s.nextInt();
int b=a*a;
int c=b*b*b;
System.out.println("Square="+b);
System.out.println("Cube of Square="+c);
}

}