package state;

public class CloseState implements ConnectionState {
	

	@Override
	public void openConnection(Connection conn) {
		
		System.out.println("The connection is open now.");
		//changing from CloseState to OpenState
		conn.currentState = new OpenState();
		
	}

	
	@Override
	public void closeConnection(Connection conn) {
		
		System.out.println("The connection is already closed!");
		
	}

}
