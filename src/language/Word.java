package language;

public class Word {
	private String s;
	private boolean desired;
	
	public Word(String s, boolean desired){
		this.s = s; this.desired = desired;
	}
	
	public int size(){
		return s.length();
	}
	
	public boolean desired(){
		return this.desired;
	}
	
	public String string(){
		return s;
	}
	
}
