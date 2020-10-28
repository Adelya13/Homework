import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write the first number");
		int number1 = sc.nextInt();
		System.out.print("Please write the second number");
		int number2 = sc.nextInt();

		if ((number1 <=0) || (number2 <= 0) ){
			System.out.println("Please write correctt numbers");
			System.exit(1);
		}
		int nok = 1;
		int arr1[];
		arr1 = new int[10];
		int arr2[];
		arr2 = new int[10];
		for (int i=0; i< arr1.length; i++){
			arr1[i]=0;
			arr2[i]=0;
		}
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
			if ((arr1[i] !=0) || (arr2[i] !=0)) { 
				int max = Math.max(arr1[i],arr2[i]);
				nok*=Math.pow(i+1, max);
				//System.out.println((i+1) + " " + max);
			}
		}
		System.out.println("Lest common multiple is "+ nok*number2*number1);
	}
}