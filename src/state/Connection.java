package state;

public class Connection {
	
	//currentState is the current state that we are interested in
	public ConnectionState currentState;
	
	
	//the Connection object is instantiated with an initial state
	public Connection(ConnectionState state) {
		this.currentState = state;
	}
	
	public void open() {
		currentState.openConnection(this);
	}
	
	public void close() {
		currentState.closeConnection(this);
	}

}
