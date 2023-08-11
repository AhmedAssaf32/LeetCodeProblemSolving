//9. Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        
        int tmp;//, rem;
        int res = 0;
        tmp = x;
        
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        if(x == 0) {
            return true;
        }

        while (x != 0){
            
            //rem = x % 10;
            res = (res * 10) + (x % 10);
            x = x / 10;
            
            if(tmp == res)
                return true;
        }
        
        return false;
        
    }
}
