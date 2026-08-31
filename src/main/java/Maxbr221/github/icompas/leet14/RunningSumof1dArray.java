package Maxbr221.github.icompas.leet14;

public class RunningSumof1dArray {

    // [1,2,3,4]
    // Saída: [1,3,6,10]
    public int[] runningSum(int[] nums) {
        int soma = 0;
        for(int i = 0; i < nums.length; i++){
            soma += nums[i];
            nums[i] = soma;
        }
        return nums;
    }
}
