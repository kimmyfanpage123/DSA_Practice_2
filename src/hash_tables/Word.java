package hash_tables;//(c) A+ Computer Science
//www.apluscompsci.com


//Name -


public class Word
{
	private String theValue;


	//write a constructor method
	public Word(String word) {
		theValue = word;
	}

	//write the getValue method
	public String getValue() { return theValue; }

	//write the equals method
	public boolean equals(Object obj) {
		Word other = (Word) obj;
		if (theValue.equals(other.getValue())) {
			return true;
		}
		return false;
	}

	//write the hashCode method
	public int hashCode() {
		int numVowels = 0;
		for (int i = 0; i<theValue.length(); i++){
			String letter = theValue.toLowerCase().substring(i,i+1);
			if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
				numVowels++;
			}
		}
		return (numVowels*theValue.length())%10;
	}
	//write the toString method
	public String toString(){
		if (theValue.equals(null)){
			return "";
		}
		return theValue;
	}


}
