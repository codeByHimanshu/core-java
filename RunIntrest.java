// program to find simple and compound intrest

class Intrest{
    double si,ci;
    int p,r,t;
    void input(int x,int y,int z)
    {
        p=x;
        r=y;
        t=z;
    }
    void findsi()
    {
        si = p*r*t;
        System.out.println("simple intrest is : "+si);
    }
    void findci()
    {
        ci = p*Math.pow(1.0 + r/100.0, (t*r));
        System.out.println("cumpound intrest is : "+ci);
    }
}

class RunIntrest {
public static void main(String[] args) {
    Intrest ir = new Intrest();
    ir.input(100, 5, 5);
    ir.findsi();
    ir.findci();
    
}    
}
