package Maxbr221.github.icompas.leet39;

public class SmallestRangeI {

    //nums = [1], k = 0
    // Saída: 0
    //nums = [0,10], k = 2
    // Saída: 6
    public int smallestRangeI(int[] nums, int k) {
        int menor = nums[0];
        int maior = nums[0];

        if(nums.length < 2){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < menor){
                menor = nums[i];
            }
            if(nums[i] > maior){
                maior = nums[i];
            }
        }
        int resultado = (maior - menor) - (2 * k);
        if(resultado < 0){
            return 0;
        }
        return resultado;
    }
}
