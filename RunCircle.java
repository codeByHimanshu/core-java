//program to find area and circumference of circle

class Circle{
    double r,ar,cr;
    void input(double x)
    {
        r=x;
    }
void area(){
ar = 3.14*r*r;
System.out.println("area is : "+ar);
}
void circum(){
    cr = 2*Math.PI*r;
    System.out.println("circumference is :" +cr);
}
}

class RunCircle {
    public static void main(String[] args) {
     Circle ob = new Circle();
     ob.input(7);
     ob.area();
     ob.circum();  
    }
}
