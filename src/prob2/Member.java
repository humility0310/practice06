package prob2;

public class Member {
	private String id;
	private String name;
	
	public Member(String str1, String str2){
		this.id = str1;
		this.name = str2;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString(){
		return id+": "+name;
	}
}
