import java.util.Scanner;
class SI
{
	public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter amount:");
float p=s.nextFloat();
System.out.println("enter rate :");
float r=s.nextFloat();
System.out.println("enter year :");
float n=s.nextFloat();
Float si=(p*r*n)/100;
float amt=p+si;
System.out.println("Interest="+si);
System.out.println("Total Amount="+amt);
}

}