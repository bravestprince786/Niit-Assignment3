package ssignment3;
import java.util.Scanner;
public class Check_Prime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
				System.out.println("Enter the number to check whether it is prime number or not :");
			int num=sc.nextInt();
			int m=num/2;
			boolean flag=true;
			for(int i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("It is a prime  number");
			}
			else {
				System.out.println("it is not a prime number :");
				  }
			sc.close();
			}
	}


