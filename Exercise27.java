import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write the first massive length");
		int length1 = sc.nextInt();
		System.out.print("Please write the second massive length");
		int length2 = sc.nextInt();
		if ((length1 <=0) || (length2 <= 0) ){
			System.out.println("Please write correctt lengths");
			System.exit(1);
		}
		int index = -1;
		double[] arr1;
		arr1 = new double[length1];
		double[] arr2;
		arr2 = new double[length2];

		for (int i=0; i < length1; i++ ) {
			
			System.out.println("Write the [" + i + "] number of the first array" );
			arr1[i] = sc.nextDouble();
		}
		for (int i=0; i < length2; i++) {
			
			System.out.println("Write the [" + i + "] number of the second array" );
			arr2[i] = sc.nextDouble();

		}
		for (int i = 0; i < length2 ; i++ ) {

			if (arr1[0] == arr2[i]) {
				int y = 1;
			    index = i;
				if (length1 == 1){
					System.out.println("The second contains the first");
					System.out.println("Index is " + index);
					break;
				}
				for (int j= i+1 ; j <= i + length1 - 1; j++){
					if (arr1[y] == arr2[j]){
						y++;
					}
				}
				if (y == length1 ){
					System.out.println("The second contains the first");
					System.out.println("Index is " + index);
					break;
				}
				index = -1;
			}			
		}
		if (index == -1) {
			System.out.println("There aren't matching arrays");					
		}
		
	}
}