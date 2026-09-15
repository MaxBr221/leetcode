package Maxbr221.github.icompas.leet26;

import java.util.HashSet;

public class MissingNumber {
    //nums = [0,1]
    //Saída: 2
    public int missingNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int numFalta = 0;
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        for (int i = 0; i <= nums.length; i++) {
            if(!hashSet.contains(i)){
                numFalta = i;
                break;
            }
        }
        return numFalta;
    }
}
