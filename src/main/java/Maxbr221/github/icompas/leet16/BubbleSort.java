package Maxbr221.github.icompas.leet16;

public class BubbleSort {
    //[5, 2, 8, 1]
    //[2, 1, 5, 8]
    public static void ordenar(int[] numeros) {
        for(int i = 0; i < numeros.length - 1; i++){
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if(numeros[j] > numeros[j + 1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
    }
}
