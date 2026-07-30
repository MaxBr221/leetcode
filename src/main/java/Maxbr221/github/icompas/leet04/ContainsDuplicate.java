package Maxbr221.github.icompas.leet04;

import java.util.HashSet;

public class ContainsDuplicate {


    public boolean ContainsDuplicate(int[] nums){
        HashSet<Integer> vistos = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(vistos.contains(nums[i])){
                return true;
            }else{
                vistos.add(nums[i]);
            }
        }
        return false;
    }




}
