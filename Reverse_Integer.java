//reverse integer
class Solution {
    public int reverse(int x) {
        /*int mod,div;
        for(int i = 0; i < x.length; i++){
            div = x/10;
            mod = div%10;
        }*/
        /*
        1. First, we find the remainder of the given number by using the     modulo (%) operator.
        2. Multiply the variable reverse by 10 and add the remainder into it.
        3. Divide the number by 10.
        */
        long res = 0, rem;
        if( x > Math.pow(2,31) -1 || x < -Math.pow(2,31) )
            return 0;
        while(x != 0){
            /*if(x<0)
                x = x*-1;*/
            rem = x % 10;
            res = res * 10 + rem;
            x = x / 10;
        }
        //return (x<0) ? -1 * res : res;
        //! Check for integer overflow
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int)res;
    }
}

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
*/
