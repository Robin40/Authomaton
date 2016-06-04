package language;

import java.util.ArrayList;

import authomaton.Automata;

public class Language {
	private String semantyc;
	private ArrayList<Word> words;
	
	public Language(String semantyc){
		this.semantyc = semantyc;
		words = new ArrayList<Word>();
	}

	public String getSemantyc() {
		return semantyc;
	}
	
	public ArrayList<Word> words(){
		return words;
	}
	
	public int beChecked(Automata automata){
		return automata.checkSetOfWords(this);
	}
	

	public void setSemantyc(String semantyc) {
		this.semantyc = semantyc;
	}
	
	public void addWord(Word w){
		this.words.add(w);
	}
	
	public Language union(Language l1, Language l2){
		// TO DO 
		return l2;
	}
	
	public Language intersection(Language l1, Language l2){
		// TO DO 
		return l2;
	}
}
