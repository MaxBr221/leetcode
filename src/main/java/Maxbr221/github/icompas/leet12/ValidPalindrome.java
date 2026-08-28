package Maxbr221.github.icompas.leet12;
import java.text.Normalizer;

public class ValidPalindrome {
    //Um homem, um plano, um canal: Panamá
    //amanaplanacanalpanama
    public boolean isPalindrome(String s) {
        String normalizado = Normalizer.normalize(s, Normalizer.Form.NFD);
        String semAcento = normalizado.replaceAll("\\p{M}", "");
        String apenasLetra = semAcento.replaceAll("[^a-zA-Z0-9]", "");
        String stringFinal = apenasLetra.toLowerCase();
        String frase1 = "";
        String frase2 = "";
        for (int i = 0; i < stringFinal.length(); i++) {
            frase1 += stringFinal.charAt(i);
        }
        for (int i = stringFinal.length() -1; i >= 0; i--){
            frase2 += stringFinal.charAt(i);
        }
        if(frase1.equals(frase2)){
            return true;
        }else {
            return false;
        }
    }
}
