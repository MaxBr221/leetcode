package Maxbr221.github.icompas.leet23;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length;

        while (inicio <= fim){

            int meio = (inicio + fim) / 2;

            if(nums[meio] == target){
                return meio;
            }
            if (target < nums[meio]){
                fim = meio - 1;
            }
            else{
                inicio = meio + 1;
            }
        }
        return -1;
    }
}
