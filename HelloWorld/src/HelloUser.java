
public class HelloUser {
	
	String name;
	
	public HelloUser(String UserName){
		this.name=UserName;
	}
	
	public void greetUser(){
		System.out.println("Hello "+name+"!");
	}

}
