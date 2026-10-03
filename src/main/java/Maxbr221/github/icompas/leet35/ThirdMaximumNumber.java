package Maxbr221.github.icompas.leet35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ThirdMaximumNumber {
    //nums = [3,2,1]
    // Saída: 1
    // Explicação:
    //O primeiro máximo distinto é 3.
    //O segundo máximo distinto é 2.
    //O terceiro máximo distinto é 1.
    public int thirdMax(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int maior = 0;
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        if(hashSet.size() < 3){
            for (int numero: nums) {
                if (numero > maior) {
                    maior = numero;
                }
            }
        }else{
            var lista = new ArrayList<>(hashSet);
            Collections.sort(lista);
            maior = lista.get(lista.size() - 3);
        }
        return maior;

    }
}
