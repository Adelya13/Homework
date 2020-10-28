import java.util.Scanner;

public class Exercise22Evclid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please write the first number");
		int number1 = sc.nextInt();
		System.out.print("Please write the second number");
		int number2 = sc.nextInt();
		while (number1 != number2){
			if (number1 > number2) {
				number1 -= number2;
			}
			else{
				number2 -= number1;
			}
		}
		System.out.println("Greatest common divisor is "+ number1);
	}
}