package weekthree.dayone;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type number to check Armstrong number");
		int a=sc.nextInt();
		if (a>=100 && a<=1000) {
		int b,c = 0,d,e = 0;
		d=a;
		while(a>0) {
			b=a%10;
			c=b*b*b;
			e=e+c;
			a=a/10;
			
		}
		if(e==d) {
			System.out.println("your number is armstrong number");
		}else {
			System.out.println("your number is not armstrong number");
		}
		}
		else {
			System.out.println("Print number between 100 and 1000");
		}
	}
	
}

