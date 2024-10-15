// program to demonstrate try with multiple catch
import java.util.*;
class Exception4
{
public static void main(String args[])
{
int ar[] = new int[10];
int index,element;
Scanner sc = new Scanner(System.in);
System.out.println("enter the index of array");
try
{
index = sc.nextInt();
element = sc.nextInt();

ar[index]=index/element;	
}
catch(ArithmeticException ae)
{
	System.out.println("it can not be devide by zero");
}
catch(ArrayIndexOutOfBoundsException arr)
{
	System.out.println("index can not be more than 0-9");
}
catch(InputMismatchException ie)
{
	System.out.println(" enter integer value only");
}
System.out.println("end of program");


}
}
 