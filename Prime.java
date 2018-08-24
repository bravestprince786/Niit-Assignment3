package ssignment3;
//import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in specific Range from 1 to 100");
		//int num=sc.nextInt();
		//int m=num/2;
		
		for(int i=2; i < 100; i++){

            boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++){

                    if(i % j == 0){
                            isPrime = false;
                            break;
                    }
            }
            // print the number
            if(isPrime)
                    System.out.print(i + " ");
    }

}
}
