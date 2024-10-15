// throw clause 
// program to demonstration of throw clause in context of pre defined Exception


import java.util.*;
class TestThrow
{
public static void main(String args[]){
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("enter two numbers");
a = sc.nextInt();
b =sc.nextInt();
try
{
	if(b==0)
	{
	ArithmeticException ar = new ArithmeticException("error it can not be devided by 0");
	throw ar;
	}
	c =a/b;
	System.out.println("devision="+c);
}
catch(ArithmeticException ae)
{
	System.out.println(ae);
}
System.out.println("end of the program");
}
}