package venkat;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserScore {

	private Double completionPercentage;
	private User user;
	private Course course;
	
	
	
	public UserScore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserScore(Double completionPercentage, User user, Course course) {
		super();
		this.completionPercentage = completionPercentage;
		this.user = user;
		this.course = course;
	}
	public Double getCompletionPercentage() {
		return completionPercentage;
	}
	public void setCompletionPercentage(Double completionPercentage) {
		this.completionPercentage = completionPercentage;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	static Map<String,UserScore> getTopPerformer(List<UserScore> scoreList){
		
		
		TreeMap<String , UserScore> topper = new TreeMap<String,UserScore>;
		for(UserScore Score : scoreList) {
			
			if()
			
	
			
	
	
			
		}
		
		return null;
		
		
	}
}
