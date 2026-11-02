package Maxbr221.github.icompas.leet49;

import java.util.Stack;

public class ValidParentheses {
    //Entrada: s = "()"
    //Saída: verdadeiro
    public boolean isValid(String s) {
        Stack<Character> pilha = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char caractere = s.charAt(i);
            if(caractere == '(' || caractere == '{' || caractere == '['){
                pilha.push(caractere);
            }
            else if (caractere == ')') {
                if(pilha.isEmpty()){
                    return false;
                }
                char ultimoIndice = pilha.peek();
                if(ultimoIndice != '('){
                    return false;
                }
                else{
                    pilha.pop();
                }
            }
            else if (caractere == '}') {
                if(pilha.isEmpty()) {
                    return false;
                }
                char ultimoIndice = pilha.peek();
                if(ultimoIndice != '{'){
                    return false;
                }
                else{
                    pilha.pop();
                }
            }
            else if (caractere == ']') {
                if(pilha.isEmpty()) {
                    return false;
                }
                char ultimoIndice = pilha.peek();
                if(ultimoIndice != '['){
                    return false;
                }
                else{
                    pilha.pop();
                }
            }
        }
        return pilha.isEmpty();
    }
}
