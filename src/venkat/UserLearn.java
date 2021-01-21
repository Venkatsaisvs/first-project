package venkat;

import java.util.List;

public class UserLearn {

	private String name;
	private String emailId;
	private String contactNumber ;
	private List<UserScore> userScoreList;
	
	
	public UserLearn() {}


	public UserLearn(String name, String emailId, String contactNumber, List<UserScore> userScoreList) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.userScoreList = userScoreList;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public List<UserScore> getUserScoreList() {
		return userScoreList;
	}


	public void setUserScoreList(List<UserScore> userScoreList) {
		this.userScoreList = userScoreList;
	}
	
	
	
	
	
}
