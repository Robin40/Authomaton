package authomaton;

public interface INodeAutomata {
	public boolean isFinal();
	
	public INodeAutomata getNextState(char c);
	
	public void addNeighbour(char c, INodeAutomata neighbour);
	
}
