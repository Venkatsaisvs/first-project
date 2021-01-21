package venkat;

import java.util.Date;

public class Call {
 private String contactName;
 private String type;
 private String  callType;
 	private double cost;
   private Date  duration;
   private Date date;
		public Call() {
				super();
		}
		public Call(String contactName, String type, String callType, double cost, Date duration, Date date) {
			super();
			this.contactName = contactName;
			this.type = type;
			this.callType = callType;
			this.cost = cost;
			this.duration = duration;
			this.date = date;
		}
		public String getContactName() {
			return contactName;
		}
		public Call(String contactName, String type, String callType, Date duration, Date date) {
			super();
			this.contactName = contactName;
			this.type = type;
			this.callType = callType;
			this.duration = duration;
			this.date = date;
		}
		public void setContactName(String contactName) {
			this.contactName = contactName;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getCallType() {
			return callType;
		}
		public void setCallType(String callType) {
			this.callType = callType;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public Date getDuration() {
			return duration;
		}
		public void setDuration(Date duration) {
			this.duration = duration;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		
		public void compute() {
			
			
			int total = 0;
			 total+= duration.getHours()*60*60;
			
			total+= duration.getMinutes()*60;
			total+=duration.getSeconds();
			
			switch(this.callType)
			{
			case "Local":
				if(this.type.equals("Incoming"))
				{
//					this.cost=new Double(0.0);
					this.cost=0.0*total/100;			//auto boxing
				}
				else
				{
					this.cost=0.9*total/100;
				}
				break;
			case "STD":
				if(this.type.equals("Incoming"))
				{
					this.cost=0.0*total/100;
				}
				else
				{
					this.cost=1.2*total/100;
				}
				break;
			case "ISD":
				if(this.type.equals("Incoming"))
				{
					//7.5
					this.cost=7.5*total/100;
				}
				else
				{
					//15.0
					this.cost=15.0*total/100;
				}
				break;
			case "Roaming":
				if(this.type.equals("Incoming"))
				{
					//0.6
					this.cost=0.6*total/100;
				}
				else
				{
					//1.2
					this.cost=1.2*total/100;
				}
				break;
			}
			
			
			String str=String.format("%.2f", this.cost);
			this.cost=Double.valueOf(str);
			
		}
		

}
