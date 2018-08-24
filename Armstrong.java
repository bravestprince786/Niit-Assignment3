package ssignment3;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong number :");
		int num=sc.nextInt();
		int arm=num;
		int sum=0,r,c=0;
		while(arm>0)
		{
			arm/=10;
			c++;
		}
		arm=num;
		while(arm>0)
		{
			
			r=arm%10;
			sum+=Math.pow(r,c);
			arm/=10;
		
		
		}
		if(num==sum)
		{
			System.out.println("It is a Armstrong Number :"+sum);
		}
		else
		{
			System.out.println("It is not a Armstrong number :"+sum);
		}
		sc.close();
	}

}
