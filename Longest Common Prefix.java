//14. Longest Common Prefix
class Solution {
    
 public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        //The indexOf() method returns the position of the first occurrence of specified character(s) in a string
        while (strs[i].indexOf(prefix) != 0) { 
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}    
    
    
//     public String longestCommonPrefix(String[] strs) {
//         int l = strs.length;
//         char a,b;
//         //String [] c = new String[l];
//         String  c ;

        
//         for(int i=0; i <strs.length; i++){
//             for(int j=i; j < strs[i].length() ;j++){
                
//                 a = strs[i].charAt(j);
                
//                 for(int k=i+1; k < strs[i].length() ;k++){
                    
//                     b = strs[i].charAt(k);
                    
//                     if(a == b){
                        
//                         //c[i] = ""+a;
//                         c = "f"+a;
                        
//                         return c;
//                     }
                    
//                 }
                
                
//             }
            
            
//         }
        
//         return "";
        
//     }
}
