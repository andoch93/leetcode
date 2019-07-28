package easy;


/*
 
	Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
	
	 
	
	Example 1:
	
	Input: "leetcodeisacommunityforcoders"
	Output: "ltcdscmmntyfrcdrs"
	        "ltcdscmmntyfrcdrs"
	
	Example 2:
	
	Input: "aeiou"
	Output: ""
	 
	
	Note:
	
	S consists of lowercase English letters only.
	1 <= S.length <= 1000
	
 */
public class RemoveVowelsFromString {
	
    public static String removeVowels(String S) {
    	
    	String stringWOVowels = "";
    	
    	for(int i = 0; i < S.length(); i++) {
    		
    		if (S.charAt(i) == 'a') {
    			continue;
    		} else if (S.charAt(i) == 'e') {
    			continue;
    		} else if (S.charAt(i) == 'i') {
    			continue;
    		} else if (S.charAt(i) == 'o') {
    			continue;
    		} else if (S.charAt(i) == 'u') {
    			continue;
    		}
    		
    		stringWOVowels += S.charAt(i); 
    		
    	}
    	
        return stringWOVowels;
    }

	public static void main(String[] args) {
		
		String strInput = "leetcodeisacommunityforcoders";
		System.out.println(removeVowels(strInput));

	}

}
