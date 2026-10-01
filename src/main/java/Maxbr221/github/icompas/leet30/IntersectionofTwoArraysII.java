package Maxbr221.github.icompas.leet30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {
    // nums1 = [1,2,2,1], nums2 = [2,2]
    // Saída: [2,2]
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> intersecao = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hashMap.put(nums1[i], hashMap.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(hashMap.containsKey(nums2[i])){
                if(hashMap.get(nums2[i]) > 0){
                    intersecao.add(nums2[i]);
                    hashMap.put(nums2[i], hashMap.get(nums2[i]) -1);
                }
            }else{
                hashMap.put(nums2[i], i);
            }
        }
        int[] resultado = new int[intersecao.size()];
        int index = 0;
        for (int num: intersecao){
            resultado[index++] = num;
        }
        return resultado;
    }
}
