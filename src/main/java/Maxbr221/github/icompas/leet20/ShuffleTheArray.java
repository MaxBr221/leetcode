package Maxbr221.github.icompas.leet20;

public class ShuffleTheArray {
    // nums = [2,5,1,3,4,7], n = 3
    // Saída: [2,3,5,4,1,7]
    public int[] shuffle(int[] nums, int n) {
        int[] novoArray = new int[nums.length];

        for (int i = 0; i < n; i++) {
            novoArray[i * 2] = nums[i];
            novoArray[i * 2 + 1] = nums[n + i];
        }

        return novoArray;
    }
}
