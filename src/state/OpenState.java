package state;

public class OpenState implements ConnectionState {
	

	@Override
	public void openConnection(Connection conn) {
		
		System.out.println("The connection is already open!");
		
	}

	
	@Override
	public void closeConnection(Connection conn) {
		
		System.out.println("The connection is closed now.");
		//changing from OpenState to CloseState
		conn.currentState = new CloseState();
	}

}
