//13. Roman to Integer

class Solution {
    
  int value(char r){ 
    if (r == 'I') 
      return 1; 
    if (r == 'V') 
      return 5; 
    if (r == 'X') 
      return 10; 
    if (r == 'L') 
      return 50; 
    if (r == 'C') 
      return 100; 
    if (r == 'D') 
      return 500; 
    if (r == 'M') 
      return 1000; 
    return -1; 
  } 
    
  public int romanToInt(String s) {
        
    int total = 0; 
    for (int i=0; i<s.length(); i++) 
    { 
         int s1 = value(s.charAt(i)); 
         if (i+1 <s.length()) 
         { 
        int s2 = value(s.charAt(i+1)); 
        if (s1 >= s2) 
        { 
             total = total + s1; 
        } 
        else
        { 
             total = total - s1; 
        } 
         } 
         else
         { 
        total = total + s1; 
         } 
    } 
    return total;         
  }    
        
        //-----------------------------------------/
    //public int romanToInt(String s) {
//         char r,k;
//         int tmp = 0;
//         for (int i=0; i < s.length(); i++){
//             for (int j=i+1; j < s.length(); j++){
//             r = s.charAt(i);
//             k = s.charAt(j);
            
//             /*if (r == 'I' || k == 'I')   
//               tmp =  1;   
//             if (r == 'V' || k == 'V')   
//               tmp =  5;   
//             if (r == 'X' || k == 'X')   
//               tmp =  10;   
//             if (r == 'L' || k == 'L')   
//               tmp =  50;   
//             if (r == 'C' || k == 'C')   
//               tmp =  100;   
//             if (r == 'D' || k == 'D')   
//               tmp =  500;   
//             if (r == 'M' || k == 'M')   
//               tmp =  1000;   
//             //return -1; */
                
//             if (r == 'I' )   
//               tmp =  1;   
//             if (r == 'V' )   
//               tmp =  5;   
//             if (r == 'X' )   
//               tmp =  10;   
//             if (r == 'L' )   
//               tmp =  50;   
//             if (r == 'C' )   
//               tmp =  100;   
//             if (r == 'D' )   
//               tmp =  500;   
//             if (r == 'M' )   
//               tmp =  1000;      
            
//             if(Character.getNumericValue(r) > Character.getNumericValue(k) || Character.getNumericValue(r) == Character.getNumericValue(k)){
                
//                 //tmp = tmp + 1;
//                 tmp = tmp + Character.getNumericValue(r);
//             }
//             else if(Character.getNumericValue(r) < Character.getNumericValue(k)){
                
//                 //tmp = tmp - 1;
//                 tmp = tmp - Character.getNumericValue(r) ;//- Character.getNumericValue(r);
//                 //i++;
//             }
//             }
//         }
     
//         return tmp;
            
            
            
            
    //}
    
    //-----------------------------------/
}
