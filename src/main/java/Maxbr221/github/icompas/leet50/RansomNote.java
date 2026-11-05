package Maxbr221.github.icompas.leet50;

import java.util.HashMap;

public class RansomNote {
    //Entrada: ransomNote = "a", magazine = "b"
    // Saída: false
    //Entrada: ransomNote = "aa", magazine = "ab"
    // Saída: false
    //Entrada: ransomNote = "aa", magazine = "aab"
    // Saída: true
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letras = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char letra = magazine.charAt(i);
            letras.put(letra, letras.getOrDefault(letra, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char letra = ransomNote.charAt(i);
            if(letras.getOrDefault(letra, 0) > 0){
                letras.put(letra, letras.get(letra) -1);
            }else{
                return false;
            }
        }
        return true;
    }
}
