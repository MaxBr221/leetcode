package Maxbr221.github.icompas.leet21;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    //nums = [8,1,2,2,3]
    // Saída: [4,0,1,1,3]
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] resultado = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int contMenor = 0;
            for (int j = 0; j < nums.length; j++) {
                if(j != i && nums[j] < nums[i]){
                    contMenor ++;
                }
            }
            resultado[i] = contMenor;
        }
        return resultado;
    }
}
