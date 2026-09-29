package Maxbr221.github.icompas.leet34;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    // nums1 = [1,2,2,1], nums2 = [2,2]
    // Saída: [2]
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> intersecao = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hashSet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(hashSet.contains(nums2[i])){
                intersecao.add(nums2[i]);
            }
        }
        int[] resultado = new int[intersecao.size()];
        int index = 0;
        for(int num: intersecao){
            resultado[index++] = num;
        }
        return resultado;
    }

}
