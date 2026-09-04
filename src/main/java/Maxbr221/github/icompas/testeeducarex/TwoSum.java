package Maxbr221.github.icompas.testeeducarex;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        //nums = [2,7,11,15], alvo = 9
        // Saída: [0,1]
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }

            }
        }
        return new int[] {};
    }

}
