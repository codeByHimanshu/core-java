interface University
{
String uname="APJ abdul kalam technical university";
int ccode = 485;
void uaddress();

}
class Department
{
void dname(){
    System.out.println("cs departement");

}
}
class Student extends Department implements University{
public void uaddress(){
    System.out.println("adress is"+uname);
    System.out.println("college code is :"+ccode);
	public void dname(){
	System.out.println("cs departement is overrided");
	}
}
    
}
class Interface2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.uaddress();
        s.dname();
        
    }
}
