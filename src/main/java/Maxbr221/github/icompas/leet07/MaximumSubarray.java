package Maxbr221.github.icompas.leet07;

public class MaximumSubarray {
    //dificuldade media
    //nums = [-2,1,-3,4,-1,2,1,-5,4]
    public int maxSubArray(int[] nums) {
        int somaAtual = nums[0];
        int maiorSoma = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(somaAtual + nums[i] > nums[i]){
                somaAtual = somaAtual + nums[i];

            }else{
                somaAtual = nums[i];
            }
            if(somaAtual > maiorSoma){
                maiorSoma = somaAtual;
            }
        }
        return maiorSoma;
    }
}
