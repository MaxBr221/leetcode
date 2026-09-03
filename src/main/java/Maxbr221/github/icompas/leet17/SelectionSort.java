package Maxbr221.github.icompas.leet17;

public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[menor]) {
                    menor = j;
                }
            }
            int aux = nums[i];
            nums[i] = nums[menor];
            nums[menor] = aux;
        }
        return nums;
    }
}
