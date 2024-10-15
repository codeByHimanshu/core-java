//program to demonstrate method overriding(property3 of super keword : context of method)

class Base
{
int a= 10;

void display()
{
	
System.out.println("this is base class method");
System.out.println("a="+a);
}
}
class Derrived extends Base
{
	int b = 20;

	void display()// method overriding
	{
		System.out.println("this is base class and overrided by derrived class");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	void msg()
	{
	System.out.println("overriden definition");
	display();
	System.out.println("actual definition");
	super.display();
	}
}
class Super3
{
	public static void main(String args[])
	{

Derrived D = new Derrived();
D.msg();
}
}