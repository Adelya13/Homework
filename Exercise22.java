import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please write the first number ");
		int number1 = sc.nextInt();
		System.out.println("Please write the second number ");
		int number2 = sc.nextInt();

		if ((number1 <=0) || (number2 <= 0) ){
			System.out.println("Please write correctt numbers");
			System.exit(1);
		}
		int nod = 1;
		int arr1[];
		arr1 = new int[10];
		int arr2[];
		arr2 = new int[10];

		for (int i=0; i< arr1.length; i++){
			arr1[i]=0;
			arr2[i]=0;
		}
		int save1 = number1;
		int save2 = number2;

		long startTime1 = System.nanoTime();

		for (int i=1; i < arr1.length; i++ ) {

			while(number1 % (i+1) == 0) {
				arr1[i]+=1;
				number1 /= (i+1);
			} 
			while (number2 % (i+1) == 0){
				arr2[i]+=1;
				number2 /= (i+1);
			}
		}
		for (int i=0; i < arr1.length; i++ ) {
			if ((arr1[i] !=0) && (arr2[i] !=0)) { 
				int min = Math.min(arr1[i],arr2[i]);
				nod*=Math.pow(i+1, min);
				//System.out.println((i+1) + " " + max);
			}
		}
		//System.out.println("Greatest common divisor is "+ nod);
		long timeSpent1 = System.nanoTime() - startTime1;

		long startTime2 = System.nanoTime();
		while (save1 != save2){
			if (save1 > save2) {
				save1 -= save2;
			}
			else{
				save2 -= save1;
			}
		}
		long timeSpent2 = System.nanoTime() - startTime2;
		System.out.println("Greatest common divisor is "+ save1);
		System.out.println("Enumeration program executed " + timeSpent1 + " ns" + "\n" +"Evclid program executed " + timeSpent2 + " ns" );
		System.out.println("The difference is " + Math.abs(timeSpent2 - timeSpent1));
	}
}