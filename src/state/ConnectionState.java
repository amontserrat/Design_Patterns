package state;

public interface ConnectionState {

	public void openConnection(Connection conn);
	
	public void closeConnection(Connection conn);
	
}
