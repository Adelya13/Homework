public class Index_of{

	public static void main(String[] args){

		if (args.length !=2  ) {
			System.out.println("Please write correct string");
		}
		else {

			String mainStr = (args[0]);
			String findStr = (args[1]);
			int first = -1;
			int t = 0;
			int y = 1;
			int distance = 'A' - 'a';

	    

			for(int i = 0; i <= (mainStr.length() - findStr.length()); i++) {


				if (mainStr.charAt(i) == findStr.charAt(0)){

					first = i+1;
					t +=1 ;
					for (int j = first; j < first + findStr.length()-1   ; j++) {

						if (mainStr.charAt(j) == findStr.charAt(y) || (int)mainStr.charAt(j)+ distance == (int)findStr.charAt(y)  || (int)mainStr.charAt(j) == (int)findStr.charAt(y) + distance ){

							t+=1;

							if (t < findStr.length()- 1 ) {
								y++;
							}
						}	
					}								
					if (t == findStr.length()) {

						System.out.println("The first string contains the second");
						System.out.println("Index is " + first);
						break;
					}
					else {
						t = 0;
						first = -1;
					}
				}
			}

			if (first == -1) {
				System.out.println(" There aren't matching strings");				

	    	}	
	    }			
	}

}