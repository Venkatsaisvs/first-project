package venkat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Call_main {

	public static void main(String[] args) throws ParseException {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of calls");
		
		n = sc.nextInt();
		
	Call[] calls= new Call[n];
	
	SimpleDateFormat sdf1= new SimpleDateFormat("HH:mm:ss");
	
	SimpleDateFormat sdf2= new SimpleDateFormat("dd-MM-yyyy");
	
	for(int i=0;i<n;i++) {
		
		String details=sc.nextLine();
		if(details.equals(""))
			details= sc.nextLine();
		String[] arr = details.split(",");
		String contactName=arr[0];
		String type=arr[1];
		String callType=arr[2];
		Double cost;		//not given by user		
		Date duration=sdf1.parse(arr[3]);
		Date date=sdf2.parse(arr[4]);
		Call call=new Call(contactName, type, callType, duration, date);
		call.compute();
		calls[i]=call;
		
	}
	//loop the calls array and display them
			System.out.printf("%-8s %-8s %-10s %-12s %-10s %s\n","Contact","Type","Call Type","Date","Duration","Cost");
			for(Call c:calls)
			{
				System.out.printf("%-8s %-8s %-10s %-12s %-10s %.2f\n",c.getContactName(),c.getType(),c.getCallType(),sdf2.format(c.getDate()),sdf1.format(c.getDuration()),c.getCost());
			}
		}



	
	
	

		
		
		
		
	}

