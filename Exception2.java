// program to demonstrate try with finally

class Exception2
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
finally
{
rse = a-b;
System.out.println("subtraction= "+rse);

System.out.println("end of program");
}

}
}
 