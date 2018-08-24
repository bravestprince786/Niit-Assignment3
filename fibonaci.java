package ssignment3;
import java.util.Scanner;
public class fibonaci {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range to get the fibonacci series :");
		int range=sc.nextInt();
		int num1
		=0;
		int num2=1;
		int num3;
		System.out.print(num1+" "+num2);
		for(int i=0;i<range;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
			
		}
		sc.close();
	}

}
