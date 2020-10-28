import java.util.Scanner;

public class Exercise26new {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write number");
		int num = sc.nextInt();

		long maxN = doCoef(num, num/2);
		int maxL = (int) Math.log(maxN) + 1;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < (maxL+1) * (num-1-i)/2; j++){
				System.out.printf(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.printf("%-" + (maxL +1) + "d", doCoef(i,k));
			}
			System.out.println();			
		}
	
	}
	public static long doFact(int n){
		long f = 1;
		for (int i = 1; i <= n ; i++) {
			f *= i;
		}
		return f;
	}
	public static long doCoef(int n, int k){
		return doFact(n) / (doFact(k) * doFact(n-k));

	}

}