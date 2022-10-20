package hashMap;

public class Players {
	private String name;
	private int age;
	private int runs;
	private int jerseyNo;
	private String teamName;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Players(String name,int age,int runs,int jerseyNo,String teamName) {
		this.name=name;
		this.age =age;
		this.runs=runs;
		this.jerseyNo = jerseyNo;
		this.teamName= teamName;
		
		
	}
	public String toString() {
		return "Name:"+name+", "+"Age:"+age+", "+"Runs:"+runs+", "+"JerseryNo:"+jerseyNo+", "+"TeamName:"+teamName;
		
	
	}

}
