package Maxbr221.github.icompas.leet41;

public class FindThePivotInteger {
    //n = 8
    // Saída: 6
    // Explicação: 6 é o número pivô, pois: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
    public int pivotInteger(int n) {
        for (int x = 1; x <= n; x++) {
            int somaDireita = 0;
            int somaEsquerda = 0;

            for (int i = 1; i <= x; i++) {
                somaEsquerda = somaEsquerda + i;
            }
            for (int i = x; i <= n; i++) {
                somaDireita = somaDireita + i;
            }
            if(somaEsquerda == somaDireita){
                return x;
            }
        }
        return -1;
       
    }
}
