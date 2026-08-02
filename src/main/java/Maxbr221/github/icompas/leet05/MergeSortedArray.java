package Maxbr221.github.icompas.leet05;

public class MergeSortedArray {
    // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // Último elemento válido de nums1
        int j = n - 1;          // Último elemento válido de nums2
        int k = m + n - 1;      // Última posição de nums1
        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
}
