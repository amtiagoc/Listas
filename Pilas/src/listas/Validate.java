/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author niwdeyen
 */
public class Validate {

    public boolean checkParanthesisBalanced(String exp) {
        LinkedStack pila1 = new LinkedStack();
        String cadena = exp;
        for (int f = 0; f < cadena.length(); f++) {
            if (cadena.charAt(f) == '{' || cadena.charAt(f) == '[' || cadena.charAt(f) == '(') {
                pila1.push(cadena.charAt(f));
            } else if (cadena.charAt(f) == '}' || cadena.charAt(f) == ']' || cadena.charAt(f) == ')') {
                if (pila1.empty()) {
                    return false;
                } else if (cadena.charAt(f) == '}' && (char)pila1.pop() != '{') {
                    return false;
                } else if (cadena.charAt(f) == ']' && (char)pila1.pop() != '[') {
                    return false;
                } else if (cadena.charAt(f) == ')' && (char)pila1.pop() != '(') {
                    return false;
                }
            }
        }
        return pila1.empty();
    }
}
