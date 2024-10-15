// program to demonstration of throws clause/keyword

import java.io.*;
class TestThrows
{
public static void main(String args[])throws IOException,ArrayIndexOutOfBoundsException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String name;
System.out.println("enter the name");
name = br.readLine();
System.out.println("name1\t"+name);
System.out.println("name2\t"+args[0]);



}
}