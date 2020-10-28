import java.util.Scanner;
public class  FindBrecket{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write string");
		String str = sc.nextLine();
		System.out.println(findBreck(str));		
	}
	
    public static boolean findBreck(String str){
    	return findBreck(str, 0);
    }

	public static boolean findBreck(String str, int cntBr){
		int len = str.length();
		int cntBrec = cntBr;
		if(str.charAt(0) == '('){
			cntBrec += 1;
		}
		else{
			if(str.charAt(0) == ')'){
				cntBrec -= 1;
			}
		}
		//System.out.println(cntBrec);
		if (cntBrec < 0){
			return false;
		}
		else if (len == 1){		
			if (cntBrec == 0){
				return true;
			}
			else{
				return false;
			}			
		}
		else{
			return findBreck(str.substring(1), cntBrec);
		}
	}
}