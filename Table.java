import java.util.Scanner;
public class Table{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=1,n;
System.out.println("Enter the number");
n=sc.nextInt();
while(a<=10){
System.out.println(n+"*"+a+"="+(n*a));
++a;
}
}
}