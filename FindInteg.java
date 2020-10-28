import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
public class FindInteg{
	

	public static void main(String[] args) throws IOException {
		

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Write the begining of the segment");
		double xa = sc.nextInt();
		System.out.println("Write the ending of the segment");
		double xb = sc.nextInt();
		System.out.println("How many sigments to divide a segment?");
		int num= sc.nextInt();	
		sc.nextLine();	
		
			
		while(true){	
			
			System.out.println("Write method");
			String method=sc.nextLine();
			FileOutputStream output = new FileOutputStream("output.txt",true);
			String op = "";

			switch(method){
				case "Sympson's method":	
					op = String.format("%.4f\n",doSymp(xa,xb,num));
					//System.out.printf();		
					break;
				case "Trapezium method":
					op = String.format("%.4f\n",doTrap(xa,xb,num)); 
					//System.out.printf();					
					break;
				case "Rectangle method":
					op = String.format("%.4f\n",doRect(xa,xb,num));
				 	//System.out.printf("%.4f\n",doRect(xa,xb,num));				
					break;	
				case "exit":
				System.exit(0);
					break;
				default:
					op = "Uknown method";
					//System.out.println();
			}
			output.write(op.getBytes());
			output.close();
		}

	}
	public static double culcF(double x){	
		return x*x;
	}
	public static double doSymp(double xa, double xb, int num){
		double dx = (xb-xa)/num;
		double x0 = xa;
		double sum = 0.0;
		int j = 1;
		for(double i=xa+dx; i<=xb-dx; i=i+dx){
			if(j % 2 == 0 ){			
				sum += dx/3.0 * 2.0 *culcF(i);
			}
			else{
				sum += dx/3.0 * 4.0 *culcF(i);
			}
			j++;	
		}		
		return (dx/3*culcF(xa)+ dx/3*culcF(xb) + sum);		
	}
	public static double doTrap(double xa, double xb, int num){
		double dx = (xb-xa)/num;
		double sum = 0.0;
		for(double i=xa+dx;i<=xb; i=i+dx){
			sum+= dx*(culcF(i)+culcF(i-dx))/2.0;
		}
		return sum;
	}
	public static double doRect(double xa, double xb, int num){
		double dx = (xb-xa)/num;
		double sum =0;
		for(double i=xa+dx;i<=xb; i=i+dx){
			sum+= dx*culcF(i);
		}
		return(sum);
	}

}