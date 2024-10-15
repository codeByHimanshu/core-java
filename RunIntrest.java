class Intrest{
    int p,r,t;
    double si,ci,ta;
    void getdata(int x,int y,int z)
    {
     p=x;
     r=y;
     t=z;
    }
    void findsi()
    {
si = (p*r*t)/100;
System.out.println("simple intrest="+si);
    }
    void findci()
    {

        ta=p*(Math.pow((1+r/100.0),t));
        ci = ta -p;
        System.out.println("compound intrest="+ci);
    }
}
   
     class RunIntrest
         {
           public static void main(String[] args) {
            
            Intrest inst=new Intrest();
            inst.getdata(1200,4,3);
            inst.findsi();
            inst.findci();
        
           }  
        }
    
    