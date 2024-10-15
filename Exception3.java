// program to demonstrate try with catch

class Exception3
{
public static void main(String args[])
{
int a,b, rse;
a =10;
b=0;
try
{
rse = a+b;
System.out.println("addition= "+rse);

rse = a/b;
System.out.println("devision= "+rse);
rse = a*b;
System.out.println("multiplication = "+rse);
}
catch(ArithmeticException ae)
{
System.out.println("msg1 : it can not be devided by zero");
System.out.println(" msg2="+ae.getMessage());
System.out.println("msg3:"+ae);
System.out.println("msg4");
ae.printStackTrace();
}
rse = a-b;
System.out.println("subtraction= "+rse);
System.out.println("end of program");


}
}
 