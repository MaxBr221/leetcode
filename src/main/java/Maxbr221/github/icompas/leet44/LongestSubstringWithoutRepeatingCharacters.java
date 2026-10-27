package Maxbr221.github.icompas.leet44;

public class LongestSubstringWithoutRepeatingCharacters {
    //s = "abcabcbb"
    // Saída: 3
    //abc
    public int lengthOfLongestSubstring(String s) {
        int maior = 1;
        if (s.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {
                boolean repetido = false;

                for(int k = i; k < j; k++){
                    if(s.charAt(k) == s.charAt(j)){
                        repetido = true;
                        break;
                    }
                }if(repetido){
                    break;
                }
                int tamanho = j - i + 1;
                if(tamanho > maior){
                    maior = tamanho;
                }
            }
        }return maior;
    }
}
