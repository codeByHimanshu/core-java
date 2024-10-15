//nested try
// a try within try block is called nested try 

import java.util.*;
class Exception6
{
public static void main(String args[])
{
int a,b,c;
int ar[] = new int[10];
Scanner sc = new Scanner(System.in);
try
{
	System.out.println("enter two numbers");
try{
	a = sc.nextInt();
	b = sc.nextInt();
}
catch(InputMismatchException im)
{
	System.out.println("error: re-enter integer value only");
	sc = new Scanner(System.in);
    a = sc.nextInt();
	b = sc.nextInt();
}
ar[a]=a/b;
System.out.println("processingg....................");
}
catch(Exception e)
{
	System.out.println(e);
}
System.out.println("end of program");
}
}
 