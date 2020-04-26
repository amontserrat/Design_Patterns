package state;

public class Exec {

	public static void main(String[] args) {
		
		//Create a new connection with an initial state
		ConnectionState initialState = new CloseState();
		Connection myConnection = new Connection(initialState);

		//Change the connection state
		myConnection.open();
		myConnection.open();
		myConnection.close();
		myConnection.open();
		myConnection.close();
		myConnection.close();
	}

}
