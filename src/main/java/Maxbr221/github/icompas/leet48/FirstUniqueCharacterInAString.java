package Maxbr221.github.icompas.leet48;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    //Entrada: s = "leetcode"
    //Saída: 0
    //Entrada: s = "loveleetcode"
    //Saída: 2
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> resultado = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            resultado.put(s.charAt(i), resultado.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(resultado.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
