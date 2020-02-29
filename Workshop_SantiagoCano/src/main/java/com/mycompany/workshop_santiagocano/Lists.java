/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.workshop_santiagocano;

/**
 *
 * @author cano2
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CircularSinglyLinkedList<Integer> myCSLL = new CircularSinglyLinkedList<>();
        myCSLL.addOrdered(9);
        myCSLL.addOrdered(2);
        myCSLL.addOrdered(7);
        myCSLL.addOrdered(8);
        System.out.println("Current list: " + myCSLL.showData());
        CircularSinglyLinkedList<Integer> myCSLL2 = new CircularSinglyLinkedList<>();
        myCSLL2.addOrdered(5);
        myCSLL2.addOrdered(10);
        myCSLL2.addOrdered(11);
        System.out.println("Second list: " + myCSLL2.showData());
        String merging = myCSLL.MergingLists(myCSLL, myCSLL2);
        System.out.println("The result of the lists merged: " + merging);
        
                Operations<String> Music = new Operations<>();
        Music.AddSong("Puto el que lo lea");
        System.out.println(Music.showData());
    }
}
