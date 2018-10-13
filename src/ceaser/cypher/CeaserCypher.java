package ceaser.cypher;

public class CeaserCypher {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String name = "rfwhzx hwfxxzx";
        
        for(int shiftKey = 0; shiftKey < alphabet.length(); shiftKey++) { // Testing all possible shifts (0 - 26)
            String result = "";
            for (int i = 0; i < name.length(); i++) {                    // for each letter within the name
                if(name.charAt(i) == ' ') {result += ' '; continue;}     // dont process spaces
                int charPosition = alphabet.indexOf(name.charAt(i));     // get the position of the current letter within the alphabet
                int keyVal = (charPosition - shiftKey);                  // calculate the position of the character within the shifted alphabet
                if (keyVal < 0) { keyVal = alphabet.length() + keyVal; } // If the result is negative (over edge of alphabet) roll over to other side
                result += alphabet.charAt(keyVal);                       // add the resultant character to a new string
            }
            System.out.println(result + " is the result with a shift of " + shiftKey);
        }         
    } 
}
