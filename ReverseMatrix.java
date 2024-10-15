
import java.util.Scanner;
class ReverseMatrix{
public static void main(String args[]){
int m[][] = new int[3][3];
int i,j ;
System.out.println("enter an array of 3*3");
Scanner sc = new Scanner(System.in);
for(i=0;i<3;i++){

for(j=0;j<3;j++){
m[i][j]=sc.nextInt();
}
}
System.out.println("printing transpose matrix");
for(i=0;i<3;i++){
	
for(j=0;j<3;j++){
	
	 m[i][j]= m[j][i];
	System.out.print(m[i][j]+" ");
}
System.out.println();
}


}
}