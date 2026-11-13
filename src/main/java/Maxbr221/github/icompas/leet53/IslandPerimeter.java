package Maxbr221.github.icompas.leet53;

public class IslandPerimeter {
    //int[][] grid = new int[][]{{0, 1, 0, 0},
    //                           {1, 1, 1, 0},
    //                           {0, 1, 0, 0},
    //                           {1, 1, 0, 0}};
    // Resultado: 16
    // Explicação: O perímetro são as 16 listras amarelas na imagem acima.
    public int islandPerimeter(int[][] grid) {
        int contPerimetro = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){
                    contPerimetro = contPerimetro + 4;
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                        contPerimetro--;
                    }
                    if(j - 1 >= 0 && grid[i][j - 1] == 1){
                        contPerimetro--;
                    }
                    if(i + 1 < grid.length && grid[i + 1][j] == 1){
                        contPerimetro--;
                    }
                    if(i - 1 >= 0 && grid[i - 1][j] == 1){
                        contPerimetro--;
                    }
                }
            }
        }
        return contPerimetro;
    }
}
