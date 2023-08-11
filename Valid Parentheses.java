//20. Valid Parentheses
import java.util.*;
class Solution {
    
    public boolean check(char s1, char s2) {
        
        if(s1=='(' && s2 == ')')
            return true;
        else if(s1=='{' && s2 == '}')
            return true;
        else if(s1=='[' && s2 == ']')
            return true;
        return false;
        
    }
    
    public boolean isValid(String s) {
        
        //Stack<char> st = new Stack<char>();
        Deque<Character> st = new ArrayDeque<Character>();
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                
                st.push(s.charAt(i));
                
            }
            
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                
                if(st.isEmpty() || !check(st.peek(),s.charAt(i))){
                    
                    return false;
                    
                }
                else
                st.pop();
                
            }
            
            
            
        }
        
        return st.isEmpty();
        
    }
}
