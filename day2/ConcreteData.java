package week3.day2;

public class ConcreteData implements DatabseConnection {

	public void connect() {
		System.out.println("connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("execute update");
		
	}
    public static void main(String[] args) {
	ConcreteData cn=new ConcreteData();
	cn.connect();
	cn.disconnect();
	cn.executeUpdate();
	
	
	
    }
}
