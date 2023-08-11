//4. Median of Two Sorted Arrays
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/

/*class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tmp1, tmp2, m, n;
        int  index = 0;
        double median;
        m = nums1.length;
        n = nums2.length;
        int [] mergedArray = new int [m+n];

        for(int i = 0; i < m-1; i++){
            if(nums1[i] < nums1[i+1]){
                tmp1 = nums1[i];
                nums1[i] = nums1[i+1];
                nums1[i+1] = tmp1;

                //add number after sorting to the merged array
                mergedArray[index] = nums1[i];
                index++;
            }
            //mergedArray[index] = nums1[i];
            //index++;
        }
            for(int j = 0; j < n-1; j++){
                if(nums2[j] < nums2[j+1]){
                tmp2 = nums2[j];
                nums2[j] = nums2[j+1];
                nums2[j+1] = tmp2;

                //add number after sorting to the merged array
                mergedArray[index] = nums2[j];
                index++;
            }
            
            }
            
        //}
        //if its even --> take the middle two number and divide it by two
            if(mergedArray.length % 2 == 0){
                int mid = mergedArray.length / 2;
                int mid2 = mid+1;
                //double midd =  
                median = (mergedArray[mid] + mergedArray[mid2]) / 2;

            } 
            ////if its odd --> take the middle number and return it as median
            else {
                int mid =(int) Math.ceil(mergedArray.length / 2);
                median = mergedArray[mid];
            }
    return median;
    }
}
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int[] mergedArray = new int[totalLength];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }
        
        if (totalLength % 2 == 0) {
            int mid = totalLength / 2;
            int mid2 = mid - 1;
            return (mergedArray[mid] + mergedArray[mid2]) / 2.0;
        } else {
            int mid = totalLength / 2;
            return mergedArray[mid];
        }
    }
}
