package module1;

public class Client {
	private String id;
	private String fullName;
	Client(String id,String name) {
		this.id=id;
		this.fullName=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
