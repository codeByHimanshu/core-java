// write a program to print a number is prime or not using constructor overloading 

class Prime{
int n,i,s=0;
Prime()
{
n=23;
}
Prime(int x)
{
n = x;
}
void check()
{
for(i=2;i<n;i++)
{
if(n%i==0)
{
s++;
break;
 }
 
}
if(s==0)
System.out.println(n+"is prime number");
else
System.out.println(n+"is not prime");
}
}
class ConstructorOverloading
{
public static void main(String args[]){
Prime p1 = new Prime();
Prime p2 = new Prime(78);
p1.check();
p2.check();
}
}