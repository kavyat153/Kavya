package week3.day2;

public class JavaConnection extends MySqlConnection {

	public void connect() {
		System.out.println("connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("executeupdate");
		
	}
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();
	}

	
}
