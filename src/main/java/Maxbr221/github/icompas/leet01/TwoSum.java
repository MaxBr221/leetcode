package Maxbr221.github.icompas.leet01;

public class TwoSum {

//força bruta(verifica todas as possibilidades)
    public int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i + j] == target){
                    return new int[] {i,j};
                }

            }

        }
        return new int[] {};

    }
}