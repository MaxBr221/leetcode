package Maxbr221.github.icompas.leet31;

import java.util.HashMap;

public class ContainsDuplicateII {
    //nums = [1,2,3,1], k = 3
    // Saída: true
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//         O(n^2)
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if(nums[i] == nums[j] && (j - i) <= k){
//                    return true;
//                }
//            }
//        }
//        return false;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i]) && i - hashMap.get(nums[i]) <= k){
               return true;
            }
            hashMap.put(nums[i], i);
        }return false;
    }
}
