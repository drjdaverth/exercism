public class PangramChecker {

    public boolean isPangram(String input) {
        // evalString ordered by frequency for performance reasons
    	char[] evalString = new char[] { 
    		'e', 'a', 'r', 'i', 'o', 't', 'n', 's', 'l', 
    		'c', 'u', 'd', 'p', 'm', 'h', 'g', 'b', 'f', 
    		'y', 'w', 'k', 'v', 'x', 'z', 'j', 'q' 
    	};

    	// Hack for case insensitivity
    	input = input.toLowerCase();
    	
    	for (int i=0; i<=24; i++) {
    		if (input.indexOf(evalString[i]) < 0 ) {
    			return false;
    		}
    	}

	    return true;
    }

}