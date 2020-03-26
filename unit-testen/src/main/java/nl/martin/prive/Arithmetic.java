package nl.martin.prive;

public class Arithmetic {
	public int square (int number) {
		return number*number;
	}
    public int countA(String input){
    	int result=0;
    	for (int i=0; i<input.length();i++) {
    		if (input.charAt(i)=='A' || input.charAt(i)=='a') result++;
    	}
    	return result;
    }
}
