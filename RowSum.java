
import java.util.Scanner;

class RowSum
{
public static void main(String args[]){
	int m[][] = new int[5][4]; 
int i,j,row=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter a matrix of 5*4");
for(i=0;i<5;i++)
{
for(j=0;i<4;i++)
{
    m[i][j]=sc.nextInt();
}
}
for(i=0;i<5;i++){
	for(j=0;i<4;i++){
		row = row+m[i][j];
	}

		System.out.println("sum of " +(i+1)+ " row:"+row);
}




}
}
