import java.util.Scanner;

public class Multi {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
	
		x= sc.nextInt();
		y= sc.nextInt();
		 
		
		for(int i=x; i<y;i++)
		{
			int sum = 0; 
			for(int j = 1; j<=i/2; j++) {

				
				if ( i%j== 0 ) {
					
					sum= sum+j;
				}
				
				
				
				
			}
			if(sum>i)
			{
				System.out.println(i);
			}
			
		}
		
		
		
		
	}
	
	}

