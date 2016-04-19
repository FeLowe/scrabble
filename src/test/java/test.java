import org.junit.*;
import static org.junit.Assert.*;

public class test {


   @Test
	  	public void splitUp_separateLetters_parsed() {
	    Scrabble testScrabble = new Scrabble();
	   	Integer expected = 1;
	    
	   	assertEquals(expected, testScrabble.scrabbleMethod("A"));
  }

     @Test
	  	public void splitUp_separateAndAddNumbers_parsed() {
	    Scrabble testScrabble = new Scrabble();
	   	Integer expected = 1;
	    
	   	assertEquals(expected, testScrabble.scrabbleMethod("E"));
  }


     @Test
	  	public void splitUp_separateManyChar_parsed() {
	    Scrabble testScrabble = new Scrabble();
	   	Integer expected = 3;

	    
	   	assertEquals(expected, testScrabble.scrabbleMethod("EAA"));
  }

  @Test
  	public void splitUp_seperateWord_returnValueOfFullWord(){
  		Scrabble testScrabble = new Scrabble();
  		Integer expected = 5;

  		assertEquals(expected, testScrabble.scrabbleMethod("Cat"));
  	}

}
