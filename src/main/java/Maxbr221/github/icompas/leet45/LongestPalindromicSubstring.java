package Maxbr221.github.icompas.leet45;

public class LongestPalindromicSubstring {
    //Input: s = "babad"
    //Output: "bab"
    //Input: s = "cbbd"
    //Output: "bb"
    public String longestPalindrome(String s) {
        String maiorPalindromo = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String palavra = s.substring(i, j + 1);
                int esquerda = 0;
                int direita = palavra.length() - 1;
                boolean isPalidromo = true;

                while(esquerda < direita){
                    if(palavra.charAt(esquerda) != palavra.charAt(direita)){
                        isPalidromo = false;
                        break;
                    }
                    esquerda++;
                    direita--;
                }
                if(isPalidromo){
                    if(palavra.length() > maiorPalindromo.length()){
                        maiorPalindromo = palavra;
                    }
                }

            }
        }return maiorPalindromo;
        
    }
}
