import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int arr1[]= {1,2,3,4,5,6,7,8,9};
	int []arr2= {1,2,8,9,12,46,76,82,15,20,30};
	int count=0;
for(int i=0;i<=arr1.length-1;i++) {
	for(int j=0;j<=arr2.length-1;j++) {
		if(arr2[j]%arr1[i]==0) {
			count=count+1;
		}
	}
		System.out.print(arr1[i]+":"+count+" ");
		count=0;
	
}
}
}