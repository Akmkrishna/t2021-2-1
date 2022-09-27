import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a input x");
int x=scan.nextInt();
for(int i=0;i<=2*x;i++) {
	if(i%2!=0) {
		System.out.print(i+" ");
	}
}
	}

}
