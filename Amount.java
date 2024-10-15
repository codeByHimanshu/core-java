// program ton demonstration of // user defined exception

 import java.util.*;
 
 class AmountException extends Exception
 {
 AmountException()
 {
 super("Exceptioon:enter amount in multiple of 100");
 }
 }
 
 class Amount
 {
 public static void main(String args[])
 {
 int amt;
 Scanner sc = new Scanner(System.in);
 try
 {
 System.out.println("enter the amount");
 amt = sc.nextInt();
 if(amt%100!=0)
 {
 throw new AmountException();
 }
 System.out.println("peocesingg................."); 
 }
 catch(AmountException ae)
 {
	  System.out.println(ae);
 }
 catch(InputMismatchException ie)
 {
 System.out.println(ie);
 
 }
 }
 }