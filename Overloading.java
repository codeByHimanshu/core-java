// method overloding in polymorphism 

class Adition{
double res;
void sum(int a, int b)
{
res = a+b;
System.out.println("Adition is ="+res);
}
void sum(int a, float b)
{
res = a+b;
System.out.println("Adition="+res);
}
void sum(float a,int b){
res = a+b;
System.out.println("Adition="+res);
}
void sum(int a,int b,int c){
res = a+b+c;
System.out.println("Adition="+res);
}
}
class Overloading{
public static void main(String args[]){
Adition obj = new Adition();
obj.sum(10,11);
obj.sum(10,10.5f);
obj.sum(22.7f,10);
obj.sum(2,6,8);
}
}
