package Maxbr221.github.icompas.leet51;

public class ClimbingStairs {
    //Input: n = 2
    //Output: 2
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int anterior = 1;
        int atual = 2;

        for (int i = 3; i <= n; i++) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
}
