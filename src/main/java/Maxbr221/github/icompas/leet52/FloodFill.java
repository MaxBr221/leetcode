package Maxbr221.github.icompas.leet52;

public class FloodFill {
    //Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
    //Output: [[2,2,2],[2,2,0],[2,0,1]]
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int corOriginal = image[sr][sc];

        if(corOriginal == color){
            return image;
        }
        preencher(image, sr, sc, corOriginal, color);
        return image;
    }
    private void preencher(int[][] image, int linha, int coluna, int corOriginal, int color) {
        if(linha < 0 || linha >= image.length || coluna < 0 || coluna >= image[0].length){
            return;
        }
        if(image[linha][coluna] != corOriginal){
            return;
        }
        image[linha][coluna] = color;

        preencher(image, linha - 1, coluna, corOriginal, color);
        preencher(image, linha + 1, coluna, corOriginal, color);
        preencher(image, linha , coluna - 1, corOriginal, color);
        preencher(image, linha, coluna + 1, corOriginal, color);

    }
}
