package Maxbr221.github.icompas.leet32;

public class MajoritElement {
    //nums = [3,2,3]
    //Output: 3
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int contNum = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    contNum ++;
                }
            }
            if (contNum > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
}
