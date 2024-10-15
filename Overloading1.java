//program to demonstrate method overriding(runt time polymorphism)

class Base
{
int a= 10;
void showbase()
{
	System.out.println("welcome in base class");
}
void display()
{
	
System.out.println("this is base class method")
System.out.println("a="+a);
}
}
class Derrived extends Base
{
	int b = 20;
	void showderrived()
	{
		System.out.println("welcome in derrived class");
		
	}
	void display()// method overriding
	{
		System.out.println("this is base class and overrided by derrived class");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class Overriding1
{
	public static void main(String args[])
	{
Base B = new Base();
Derrived D = new Derrived();
B.showbase();
B.display();
D.showderrived();
D.display();
}
}