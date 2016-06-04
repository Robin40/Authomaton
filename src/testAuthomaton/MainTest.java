package testAuthomaton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import authomaton.Automata;
import language.Language;
import language.Word;

public class MainTest {
	private Automata automata;

	@Before
	public void init(){
		automata = new Automata();
		automata.addFinalState(); // TO - DO return id;
		automata.addEdge(0, 1, '0');
		automata.addEdge(1, 0, '0');
	}
	
	@Test
	public void testAccepts(){
		assertFalse(automata.accepts(""));
		assertTrue(automata.accepts("0"));
		assertTrue(automata.accepts("000"));
		assertFalse(automata.accepts("00"));
		assertFalse(automata.accepts("1"));
	}
	
	@Test
	public void testLanguage(){
		Word w = new Word("0",true);
		Word ww = new Word("00000",true);
		Word www = new Word("00000000",false);
		Language l = new Language("words of odd length with zeros.");
		l.addWord(www);
		l.addWord(ww);
		l.addWord(w);
		int expectedScore = 3;
		assertEquals(expectedScore,l.beChecked(automata));
	}
	

}
