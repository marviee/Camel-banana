package camels;
import java.util.Scanner;


public class camel {
	public static void main(String[]args){
		Scanner num = new Scanner (System.in);
		System.out.println("Enter numbers of bananas, x : ");  
		int x= num.nextInt();
		numberOfBananas( x);
		System.out.println("Enter number of camel(s), z: "); 
		
		int z= num.nextInt();
		
		NumberOfCamels( z);
		
		System.out.println("Enter number of bananas, k, that camel eats per km: "); 
		int k=num.nextInt();
		BananasPerKm( k);
		System.out.println("Enter the distance y: "); 
		
		int d = num.nextInt();
		distance( d);
		int c=1000;
		int t = tripNum(x, c);
		double Sum= Calculate(x,k,d,c,z,t);

		if (Sum > d){
			double Max_Bananas= Sum-d;

			System.out.println("The maximum number of bananas is " + Max_Bananas);	

		}else{
			System.out.println("Sorry, the camel has finished the bananas before it reaches " + d +"km");

		}



	}

	public static int NumberOfCamels(int z){
		return z;

	}
	public static int numberOfBananas(int x){
		return x;

	}
	public static int BananasPerKm(int k){
		return k;
	}
	public static int distance(int d){
		return d;
	}
	public static  int tripNum(int x, int c){
		return x/c;
	}
	public static double Calculate(int x, int k, int d, int c, int z, int t){
		double sum = 0;
		for (int i=1; i<=t; i++){
			sum+= (c/(((2*i)-1)))*z*k;	
		}
		sum+=(x%c)/((2*t)+1);
		return sum;
	}



}
