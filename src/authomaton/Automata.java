package authomaton;

import java.util.ArrayList;

import language.Language;
import language.Word;

public class Automata {
	private INodeAutomata initial;
	private ArrayList<INodeAutomata> states;
	
	public Automata(){
		initial = new NormalNodeAutomata("initial state");
		states = new ArrayList<INodeAutomata>();
		states.add(initial);
	}
	
	public void addNormalState(){
		states.add(new NormalNodeAutomata("normal state",states.size()));
	}
	
	public void addFinalState(){
		states.add(new FinalNodeAutomata("final state",states.size()));
	}
	
	public void addEdge(int id1, int id2, char symbol){
		states.get(id1).addNeighbour(symbol,states.get(id2));
	}
	
	public boolean accepts(String w){
		INodeAutomata current  = initial;
		for(int i = 0; i < w.length(); ++i){
			char c = w.charAt(i);
			current = current.getNextState(c);
			if(current == null) return false;
		}
		return current.isFinal();
	}
	
	//return number of words correctly accepted/rejected; 
	public int checkSetOfWords(Language l){
		int score = 0;
		for(Word w : l.words()){
			score += ((this.accepts(w.string()) == w.desired()) ? 1 : 0);
		}
		return score;
	}
	
	
	public boolean isFinished(){
		return false;
	}
}
