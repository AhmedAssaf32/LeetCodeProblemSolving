//Pow(x, n)


class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double halfPow = myPow(x, n / 2);

        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return n > 0 ? x * halfPow * halfPow : (1 / x) * halfPow * halfPow;
        }
    }
}

/*other solutions that gives Time Limit Exceeded*/

// import java.lang.Math;
// class Solution {
//     public double myPow(double x, int n) {
//         //return Math.pow(x,n);
//         double res = 1;
//         //int i=1;
//         /*if(n<0)
//           n=n*-1;*/
//         for(int i=0; i<Math.abs(n); i++){
//         //while(i<n){
//           res *= x;
//           //i++;
//         //}
//         }
//         if(n < 0)
//           return 1/res;
//         return res;
//     }

//     public int abs(int n){
//         if(n<0)
//           n = n*-1;
//         return n;
//     }
// }
// class Solution {
//     public double myPow(double x, int n) {
//         double res = 1;
//         if (n == 0) {
//             return 1.0;
//         }
//         for (int i = 0; i < Math.abs(n); i++) {
//             res *= x;
//         }
        
//         if (n < 0) {
//             return 1 / res;
//         }

//         return res;
//     }
// }

/*

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104

*/


