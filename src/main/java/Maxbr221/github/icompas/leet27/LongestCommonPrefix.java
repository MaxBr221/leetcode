package Maxbr221.github.icompas.leet27;

public class LongestCommonPrefix {
    //strs = ["flower","flow","flight"]
    // Saída: "fl"
    public String longestCommonPrefix(String[] strs) {
        String stringEncontrada = "";
        boolean encontrouDiferenca = false;
        for (int i = 0; i < strs[0].length(); i++) {
            if(encontrouDiferenca){
                break;
            }
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    encontrouDiferenca = true;
                    break;
                }
            }if(!encontrouDiferenca){
                stringEncontrada += strs[0].charAt(i);
            }
        }return stringEncontrada;
    }
}
