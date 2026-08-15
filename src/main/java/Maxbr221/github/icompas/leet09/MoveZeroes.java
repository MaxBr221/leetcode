package Maxbr221.github.icompas.leet09;

public class MoveZeroes {

    //nums = [0,1,0,3,12]
    //[1,3,12,0,0]
    //i → percorre todos os elementos
    //j → marca a próxima posição onde vai entrar um número != 0
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
