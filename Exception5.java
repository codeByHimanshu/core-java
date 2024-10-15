// program to demonstrate try with catch

//program to demonstration of try with multiple catch
import java.util.*;
class Exception5
{
public static void main(String args[])
{
	int a,b,c;
int ar[] = new int[10];
InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);
try{
System.out.println("enter two numbers");
a = Integer.ParseInt(br.readLine());
b = Integer.ParseInt(br.readLine());
ar[a]=a/b;
System.out.println("processsingg..........");	
}
catch(IOException io)
{
	System.out.println(io);
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

}
}
 