package venkat;

import java.util.Scanner;

public class Regexcheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ip adress");
		
		String input = sc.nextLine();
		String[]iparr = input.split("[.]");
	
		String status = "";
		
		if(iparr.length> 4 || iparr.length<4) {
			
			status ="invalid";
					
					System.out.println(status);
		return;
		}
		for(int i= 0 ; i<iparr.length; i++) {
			
			
			int j = Integer.parseInt(iparr[i]);
			if(j > 255|| j<=0|| iparr.length>4) {
				
				
				status = "invalid";
				
				System.out.println(status);
				break;
				
		
			
			}
			
			else {
				
				status= "vaild";
				
				
			}
			
			System.out.println(status);
		}
		
			
	}

}
