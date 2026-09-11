package Maxbr221.github.icompas.leet22;

public class SearchInsertPosition {
    //nums = [1,3,5,6], alvo = 5
    //Saída: 2
    public int searchInsert(int[] nums, int target) {
        int incio = 0;
        int fim = nums.length;

        while (incio <= fim){

            int meio = (incio + fim)/2;

            if(nums[meio] == target){
                return meio;
            }
            if (target < nums[meio]){
                fim = meio - 1;
            }else{
                incio = fim + 1;
            }
        }return incio;
    }
}
