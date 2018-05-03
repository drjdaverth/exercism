public class PangramChecker {

    public boolean isPangram(String input) {
        // evalString ordered by frequency for performance reasons
    	char[] evalString = new char[] { 
            'q', 'j', 'z', 'x', 'v', 'k', 'w', 'y','f',
            'b', 'g', 'h', 'm', 'p', 'd', 'u', 'c', 'l',
            's', 'n', 't', 'o', 'i', 'r', 'a', 'e' 
    	};

    	// Hack for case insensitivity
    	input = input.toLowerCase();
    	
    	for (int i=0; i<26; i++) {
    		if (input.indexOf(evalString[i]) < 0 ) {
    			return false;
    		}
    	}

	    return true;
    }

}