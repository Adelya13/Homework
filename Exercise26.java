import java.util.Scanner;
public class Exercise26 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Please write line number of Pascal's triangle");
		int numline = sc.nextInt();
		if (numline <= 0){
			System.out.println("Please write correctt line number of Pascal's triangle");
			System.exit(1);
		}
		int[][] arr = new int[numline+1][numline+1];

		for (int i = 0; i <= numline; i++) {
			arr[i][0] = arr[i][i] = 1;  // First and last lines are 1
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		int k=0;
     
        int maxL = String.valueOf(arr[numline][numline/2]).length();
		int maxLineLength = numline * maxL + (numline - 1);

		for (int i = 0; i < numline; i++) {
			int line = maxL * (i+1) + i;
			for (int s = 0; s < (maxLineLength - line) / 2; s ++){
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				int lengthcar= String.valueOf(arr[i][j]).length();
				
				for (int sp = 0; sp < maxL - lengthcar; sp++){
					System.out.print(" ");
				}				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}