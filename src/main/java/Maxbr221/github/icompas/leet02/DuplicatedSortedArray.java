package Maxbr221.github.icompas.leet02;

public class DuplicatedSortedArray {

    //[1,1,2,2,3]
    public int vetor(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int e = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[e]) {
                e++;
                nums[e] = nums[i];
            }
        }
        return e + 1;
    }
}
