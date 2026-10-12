package Maxbr221.github.icompas.leet38;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement {

    //Entrada: nums1 = [3,1,2], nums2 = [1,3,4,2]
    // Saída: [-1,3,-1]
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    boolean encontrou = false;
                    for (int k = j + 1; k < nums2.length; k++) {
                        if(nums2[k] > nums1[i]) {
                            resultado.add(nums2[k]);
                            encontrou = true;
                            break;
                        }
                    }
                    if (!encontrou){
                        resultado.add(-1);
                    }

                }
            }
        }
        return resultado.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
