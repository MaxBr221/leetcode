package Maxbr221.github.icompas.testeeducarex;

public class BestTimeToBuyAndSellStock {
    //[7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        int menorPreco = 0;
        int maiorLucro = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[menorPreco]){
                menorPreco = i;
            }else{
                int lucroAtual = prices[i] - prices[menorPreco];
                if(lucroAtual > maiorLucro){
                    maiorLucro = lucroAtual;
                }
            }
        }
        return maiorLucro;
    }
}
