// progran to demonstration of throws clause
import java.io.*;
class TestThrowsTryCatch
{
public static void main(String args[])throws IOException,ArrayIndexOutOfBoundsException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String name;
System.out.println("enter the name");
try
{
name = br.readLine();
System.out.println("name1\t"+name);
System.out.println("name2\t"+args[0]);
}
catch(IOException ioe)
{
System.out.println(ioe);	
}
catch(ArrayIndexOutOfBoundsException arr)
{
	System.out.println(arr);
}

}
}