
class Search1{
public static void main(String args[]){

int arr[] = {4,8,0,58,86,477,59,36,6,8};
int i,j,temp;
for(i=0;i<arr.length;i++)
{
	for(j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			 temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
		}
	}
}
System.out.println("sorted array is");
for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}