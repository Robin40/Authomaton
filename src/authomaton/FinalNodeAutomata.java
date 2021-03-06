package authomaton;

import java.util.HashMap;

public class FinalNodeAutomata implements INodeAutomata{
	private String name;
	private HashMap<Character,INodeAutomata> neighbours;
	private int id;
	
	
	public FinalNodeAutomata(){
		name = "Not named node";
		neighbours = new HashMap<Character,INodeAutomata>();
		id = 0;
	}
	
	public FinalNodeAutomata(String name){
		this.name = name;
		neighbours = new HashMap<Character,INodeAutomata>();
		id = 0;
	}
	
	public FinalNodeAutomata(String name, int id){
		this.name = name;
		neighbours = new HashMap<Character,INodeAutomata>();
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public boolean isFinal() {
		return true;
	}
	
	@Override
	public INodeAutomata getNextState(char c){
		return neighbours.get(c);
	}

	@Override
	public void addNeighbour(char c, INodeAutomata neighbour) {
		neighbours.put(c, neighbour);
	}
	
}
