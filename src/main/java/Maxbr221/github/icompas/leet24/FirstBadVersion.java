package Maxbr221.github.icompas.leet24;

public class FirstBadVersion {
    // n = 5, ruim = 4
    // Saída: 4
    public int firstBadVersion(int n) {
        int inicio = 0;
        int fim = n;

        while (inicio < fim){
            int meio = (inicio + fim) / 2;
            if(isBadVersion(meio)){
                fim = meio;
            }else{
                inicio = meio + 1;
            }
        }
        return inicio;
    }
}
