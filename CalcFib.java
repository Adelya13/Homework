import java.util.Scanner;
public class CalcFib{
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write Fibonachi number");
		int n = sc.nextInt();


		long start1 = System.nanoTime();
		int[] num;
		num = new int[n+1];	
		System.out.println(calcFib(n,num));
		long finish1 = System.nanoTime();

		long start2 = System.nanoTime();
		System.out.println(calcFib1(n));
		long finish2 = System.nanoTime();

		System.out.println("The first program's time is " + (finish1-start1)/1000 +" *10^(-6) s");
		System.out.println("The second program's time is " + (finish2-start2)/1000 +" *10^(-6) s");
	}
	


	// Utils functions	

	public static int calcFib(int n, int[] num){			    
		num[1] = num[2] = 1;
		
		if (n == 1 || n == 2){
			return 1;
		}
		else{			
		
			num[n] = calcFib(n-1,num)+calcFib(n-2,num);
			return num[n];
		}
		
	}
	public static int calcFib1(int n){
		if (n >= 1) {		
		    
			return calcFib1(n-2)+(n-1);
		}
		else{
			return -1;
		}			
	}
}