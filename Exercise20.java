import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please write number");
		int number = sc.nextInt();
		if (number < 0){
			System.out.println("Please write correctt numbers");
			System.exit(1);
		}
		

		for (int i=1; i <= number / 2; i++) {

			if (number % i == 0) {
				System.out.print(-number / i + " " );
				System.out.print(number / i );
				System.out.println();
			}
		}
		System.out.print("-1" + " 1 ");


	}
}