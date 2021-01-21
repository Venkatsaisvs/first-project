package venkat;

import java.util.Scanner;

public class Main_User1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user 1 detail:");
		String userStr1=sc.nextLine();
		System.out.println("Enter user 2 detail:");
		String userStr2=sc.nextLine();
		
		 
		 
		String[] arr= userStr1.split(",");
		
		String name = arr[0];
		String email=arr[1];
		String phoneNumber=arr[2];
		String location=arr[3];
		User user1= new User(name,email,phoneNumber,location);
		
		arr=userStr2.split(",");
		name=arr[0];
		email=arr[1];
		phoneNumber=arr[2];
		location=arr[3];
		User user2=new User(name, email, phoneNumber, location);
		

		
		System.out.println("User 1");
		System.out.println(user1);
		
		System.out.println("User 2");
		System.out.println(user2);

		System.out.println(user1.equals(user2)?"User 1 is same as User 2":"User 1 and User 2 are different");
		


	}

}
