import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 
		
		Scanner sc = new Scanner(System.in);
		
		int middle;
		
		int n;
		
		n = sc.nextInt();
		int[]  arr = new int[n];
		
		for(int i=0; i<n; i++)
		{  
		 
		arr[i]=sc.nextInt();  
		}  
		
		
		
		
		if(n%2 == 0)
		{
			middle =  arr[n/2] + arr[n/2 - 1];
		}
		else {
			middle = arr[n/2];
		}
		
		if( arr[0]== middle &&  middle == arr[n-1]) {
			
			System.out.println(arr[0]+" "+middle+" "+arr[n-1]);
			
		}
	}

}
