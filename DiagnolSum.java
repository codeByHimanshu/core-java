import java.util.Scanner;
class DiagnolSum{
public static void main(String args[]){
int m[][]=new int[4][4];
int i,j,left=0,right=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter a matrix of 4*4");

  
for(i=0;i<4;i++)
{
	for(j=0;j<4;j++)
	{
		m[i][j]=sc.nextInt();
	}
	
}

       for(i=0;i<4;i++){
	     for(j=0;j<4;j++)
	      {
	       if(i==j)
	            {
	              left+=m[i][j];
	            }	
                   if((i+j)==3)
                  {
	             right+=m[i][j];
                  }
	}
}
System.out.println("left diagnol sum ="+left);
System.out.println("right diagnol sum="+right);


}
} 