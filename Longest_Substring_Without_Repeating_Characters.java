//Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
/*
        char dummy;
        int count = 1;
        for(int i = 0 ; i < s.length()-1; i++){
            //for(int j=i+1; j<s.length()+1; j++){
            dummy = s.charAt(i);
            if(s.charAt(i) != s.charAt(i+1))
                count++;
           // }
        }
        return count;
*/
    //create hash set to add all letters to it, then to compare it latter ..
    //int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int j = 0;
        
        for (int i = 0; i < s.length(); i++) {
            //if char is not in the set --> add it to the set
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                //i + j - 1 ==> charSet.size()
                // i--> what we added to set, j --> what we removed from set, 1--> to start count from 1 not zero
                maxLength = Math.max(maxLength, i - j + 1);
            } else {
                //if the char is already at the set then remove old from the set
                //remove old set
                while (charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(j));
                    j++;
                }
                charSet.add(s.charAt(i));
            }
        }
        
        return maxLength;
    }
}
