package Maxbr221.github.icompas.leet47;

import java.util.HashMap;

public class ValidAnagram {
    //Entrada: s = "anagram", t = "nagaram"
    //Saída: verdadeiro
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> resultado = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            resultado.put(letra, resultado.getOrDefault(letra, 0) + 1);

        }
        for (int i = 0; i < t.length(); i++) {
            char letrat = t.charAt(i);
            if(!resultado.containsKey(letrat) || resultado.get(letrat) == 0){
                return false;
            }
            resultado.put(letrat, resultado.get(letrat) - 1);


        }
        return true;
    }

}
