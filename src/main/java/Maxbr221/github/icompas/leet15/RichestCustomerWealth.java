package Maxbr221.github.icompas.leet15;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int maiorValor = 0;
        for (int i = 0; i < accounts.length; i++) {
            int soma = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                soma += accounts[i][j];
            }
            if(soma > maiorValor){
                maiorValor = soma;
            }
        }
        return maiorValor;
    }
}
