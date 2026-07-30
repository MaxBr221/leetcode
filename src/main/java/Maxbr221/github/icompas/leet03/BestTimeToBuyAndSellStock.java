package Maxbr221.github.icompas.leet03;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int menorPreco = 0;
        int maiorLucro = 0;

        //[7,1,5,6]
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] <= prices[menorPreco]){
                menorPreco = i;
            }else{
                int lucroAtual = prices[i] - prices[menorPreco];
                if (lucroAtual > maiorLucro){
                    maiorLucro = lucroAtual;
                }
            }

        }return maiorLucro;
    }
}
