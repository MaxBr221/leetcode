package Maxbr221.github.icompas.leet42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumIII {
    //Saída: [[-1,-1,2],[-1,0,1]]
    // Explicação:
    //nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    //nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    //nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    //Os tripletos distintos são [-1,0,1] e [-1,-1,2].
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultado = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> combinacao = new ArrayList<>();
                        combinacao.add(nums[i]);
                        combinacao.add(nums[j]);
                        combinacao.add(nums[k]);
                        Collections.sort(combinacao);
                        if(!resultado.contains(combinacao)){
                            resultado.add(combinacao);
                        }
                    }
                }
            }
        }
        return resultado;

    }
}
