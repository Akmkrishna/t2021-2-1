import java.util.Scanner;

public class Problem1App {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter Calculator inputs of double a and double b number");
Double a=scan.nextDouble();
Double b=scan.nextDouble();
//Below code is Creation of small Calculator :-
Problem1 p=new Problem1();
//Below codes are Calling the function:-
p.add(a, b);
p.sub(a, b);
p.mul(a, b);
p.div(a, b);
	}
}
