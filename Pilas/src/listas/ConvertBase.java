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
public class ConvertBase {

    public String toBinary(int n) {
        LinkedStack Hex = new LinkedStack();
        String Hexary = "";

        while (n > 0) {
            Hex.push(n % 2);
            n /= 2;

        }
        while (!Hex.empty()) {
            try {
                Hexary += Hex.pop();
            } catch (Exception e) {
                Hexary = "Error interno";
            }
        }
        return Hexary;
    }

    public String toOctal(int n) {
        LinkedStack Hex = new LinkedStack();
        String Octal = "";

        while (n > 0) {
            Hex.push(n % 8);
            n /= 8;

        }
        while (!Hex.empty()) {
            try {
                Octal += Hex.pop();
            } catch (Exception e) {
                Octal = "Error interno";
            }
        }
        return Octal;
    }

    public String toHexa(int n) {
        LinkedStack Hex = new LinkedStack();
        String Hexa = "";

        while (n > 0) {
            if (n % 16 >= 10) {
                if (n == 10) {
                    Hex.push('A');
                }
                if (n == 11) {
                    Hex.push('B');
                }
                if (n == 12) {
                    Hex.push('C');
                }
                if (n == 13) {
                    Hex.push('D');
                }
                if (n == 14) {
                    Hex.push('E');
                }
                if (n == 15) {
                    Hex.push('F');
                }
            }
            n = n / 16;

        }
        while (!Hex.empty()) {
            try {
                Hexa += Hex.pop();
            } catch (Exception e) {
                Hexa = "Error interno";
            }
        }
        return Hexa;
    }
}
