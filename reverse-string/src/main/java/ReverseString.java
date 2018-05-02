class ReverseString {

    String reverse(String inputString) {
        String reversedword = "";

        for(int i = inputString.length() - 1; i >= 0; i--) {
        	reversedword = reversedword + inputString.charAt(i);
        }
        
        return reversedword;
    }
  
}