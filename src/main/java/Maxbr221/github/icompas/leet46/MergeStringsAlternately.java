package Maxbr221.github.icompas.leet46;

public class MergeStringsAlternately {
    //Input: word1 = "abc", word2 = "pqr"
    //Output: "apbqcr"
    public String mergeAlternately(String word1, String word2) {
        String novaPalavra = "";
        int i = 0;
        int j = 0;
        while(i < word1.length() && j < word2.length()){
            novaPalavra += word1.charAt(i);
            novaPalavra += word2.charAt(j);
            i++;
            j++;
        }
        if(word1.length() > word2.length()){
            for (int k = i; k < word1.length(); k++) {
                novaPalavra += word1.charAt(k);
            }
        }else{
            for (int k = j; k < word2.length(); k++) {
                novaPalavra += word2.charAt(k);
            }
        }
        return novaPalavra;
    }
}
