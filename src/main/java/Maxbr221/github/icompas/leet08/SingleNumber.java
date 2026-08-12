package Maxbr221.github.icompas.leet08;
public class SingleNumber {

    //[4,1,2,1,2]
    public int singleNumber(int[] nums) {
        int resultado = 0;
        for (int i = 0; i < nums.length; i++) {
            resultado = resultado ^ nums[i];
        }
        return resultado;
    }
}
