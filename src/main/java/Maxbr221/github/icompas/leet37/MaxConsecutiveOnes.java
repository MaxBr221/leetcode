package Maxbr221.github.icompas.leet37;

public class MaxConsecutiveOnes {
    // nums = [1,1,0,1,1,1]
    // Saída: 3
    // nums = [1,0,1,1,0,1]
    // Saída: 2
    public int findMaxConsecutiveOnes(int[] nums) {
        int cont = 0;
        int cont1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                cont ++;
                cont1 = Math.max(cont1, cont);
            }else {
                cont = 0;
            }
        }
        return cont1;
    }
}
