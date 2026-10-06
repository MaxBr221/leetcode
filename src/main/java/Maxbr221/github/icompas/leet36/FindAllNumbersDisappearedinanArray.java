package Maxbr221.github.icompas.leet36;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();
        for (int num: nums){
            lista.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(!lista.contains(i)){
                resultado.add(i);
            }
        }
        return resultado;
    }
}
