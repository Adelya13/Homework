import java.util.Scanner;
public class CalcFact{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(calculateFactorial(num));  
		//System.out.println(calculateFactorial(100));
		
	}

    public static int calculateFactorial(int num){
   		int fact =1;
   		if ((num == 0) || (num == 1)){
	   		return 1;
	   	}
   		else if (num>0){	   		
	        for (int i=2; i<=num; i++){
	        	if (i < Integer.MAX_VALUE){
	        		fact *= i;
	        		
	        	}
	        	else{
	        		return -1;
	        	}
	        }
	        return fact;
	    }
	    else{
	    	return -1;
	    }
    }
    
}