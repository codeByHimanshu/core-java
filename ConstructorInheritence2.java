class Number
{
    int a;
    Number(int x)
    {
        a=x;
        System.out.println("class number");
    }
}
class Value extends Number
{
    int b;
    Value(int x)
    {
        super(20);//if we do not use super keyword it will produce compile time error
        b=x;
        System.out.println("class value");
    }
    void showdata()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class ConstructorInheritence2
{
    public static void main(String[] args) {
        Value v = new Value(40);
        v.showdata();
        
    }
}

