package ssignment3;
import  java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get factorial :");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact*=i;
		}
		
		System.out.println("Factorial of a number :"+fact);
		sc.close();
	}

}
