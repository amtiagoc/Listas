/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        SinglyLinkedList<Integer> ls = new SinglyLinkedList<>();
//        ls.add(1);
//        ls.add(4);
//        ls.add(5);
//        ls.add(7);
//        System.out.println(ls.showData());
//        //Reverse list
//        ls.ReverseList();
//        System.out.println(ls.showData());
        
        
        Validate exp = new Validate();
        System.out.println("\033Is it balanced?\"");
        System.out.println(exp.checkParanthesisBalanced("(5+5/5)"));
        System.out.println("");
        
        ConvertBase data = new ConvertBase();
        System.out.println("\033[352mData to Binary: "+data.toBinary(101));
        System.out.println("\033[32mData to Hexadecimal: "+data.toHexa(190));

        ArrayQueue miCola = new ArrayQueue(5);
        try {
            miCola.offer(55);
            miCola.offer(66);
            miCola.offer(77);
            miCola.offer(88);
            miCola.offer(99);
            miCola.remove();
            System.out.println("\033[33mYour tail is: "+miCola.element());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");
        
        
    ArrayStack arregloPilas = new ArrayStack(8);
        ArrayStack arregloPilas2 = new ArrayStack(2);
        arregloPilas2.pushleft(2);
        arregloPilas2.pushright(4);
        
        System.out.println("\033[32mPush left data:");
        System.out.println(arregloPilas.pushleft(2));
        System.out.println(arregloPilas.pushleft(3));
        System.out.println(arregloPilas.pushleft(2));
        System.out.println(arregloPilas.pushleft(3));
        System.out.println(arregloPilas.pushleft(4));
        System.out.println("");
        System.out.println("\033[32mPush right data:");
        System.out.println(arregloPilas.pushright(5));
        System.out.println(arregloPilas.pushright(4));
        System.out.println(arregloPilas.pushright(8));
        System.out.println(arregloPilas.pushright(8));

        System.out.println("");
                System.out.println("\033[31mPop left data:");
        System.out.println(arregloPilas.popdleft());
        System.out.println(arregloPilas.popdleft());
        System.out.println(arregloPilas.popdleft());
        System.out.println("\033[31mPop right data:");
        System.out.println(arregloPilas.popright());
        System.out.println(arregloPilas.popright());
        System.out.println(arregloPilas.popright());
        System.out.println(arregloPilas.popright());
        System.out.println(arregloPilas.popright());
        System.out.println(arregloPilas.popright());

        System.out.println("");

        System.out.println("\033[32mArreglo 1 lleno: \033[30m" + arregloPilas.isFull());
        System.out.println("\033[32mArreglo 2 lleno: \033[30m" + arregloPilas2.isFull());
        System.out.println("");
        
        System.out.println("BONUS PARCIAL");
        
                LinkedStack pilaEnlazada = new LinkedStack();

        System.out.println("\033[31mPush 1 data:");
        System.out.println(pilaEnlazada.push1(2));
        System.out.println(pilaEnlazada.push1(3));
        System.out.println(pilaEnlazada.push1(1));

        System.out.println("");

        System.out.println("\033[31mPush 2 data:");
        System.out.println(pilaEnlazada.push2(6));
        System.out.println(pilaEnlazada.push2(2));
        System.out.println(pilaEnlazada.push2(9));

        System.out.println("");

        System.out.println("\033[31mPop 1 data:");
        System.out.println(pilaEnlazada.pop1());
        System.out.println(pilaEnlazada.pop1());
        System.out.println(pilaEnlazada.pop1());
        System.out.println(pilaEnlazada.pop1());

        System.out.println("");

        System.out.println("\033[31mPop 2 data:");
        System.out.println(pilaEnlazada.pop2());
        System.out.println(pilaEnlazada.pop2());

        System.out.println("");
    }
}
