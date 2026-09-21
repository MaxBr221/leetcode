package Maxbr221.github.icompas.leet29;

import java.util.HashSet;

public class MissingNumber {
    //nums = [3,0,1]
    //Saída: 2
    public int missingNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int faltando = 0;
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);

        }
        for (int i = 0; i <= nums.length; i++) {
            if(!hashSet.contains(i)){
                faltando = i;
            }
        }
        return faltando;
    }
}
