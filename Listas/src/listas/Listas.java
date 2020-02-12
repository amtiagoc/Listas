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
 * @author cano2030
 */
public class Listas {


    public static void main(String[] args) {

        SinglyLinkedList<Integer> miLista = new SinglyLinkedList<>();
        //Here is where is gonna be print the list even organized from Higher to Menor
        try {
            miLista.AddorderedFromHigh(11);
            miLista.AddorderedFromHigh(33);
            miLista.AddorderedFromHigh(4);
            miLista.AddorderedFromHigh(88);
            miLista.AddorderedFromHigh(99);
            miLista.AddorderedFromHigh(22);
            miLista.AddorderedFromHigh(23);
            System.out.println("Data inserted from Higher  to Menor: " + miLista.showData());
        } catch (Exception e) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, e);
        }
        //Counting all data in the list
        System.out.println("Amount of Data: " + miLista.DataCounter());
        //Printing the highest number in the list.
        System.out.println("The highest Data: " + miLista.Max());
        //Printing the smallest number in the list.
        System.out.println("The smallest Data: " + miLista.Min());
        //Printing average from all  data.
        System.out.println("The Data average: " + miLista.Average());
        //Searching  an especific data.
        miLista.Search(7);
        //Where you can see printed a new node at the end of the list.
        System.out.println("Inserting new nodes at the end of the list: " + miLista.showData());
        try {
            miLista.addLast(4);
            System.out.println("Data updated: " + miLista.showData());
        } catch (Exception e) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, e);
        }
        //Modify any data from the list.
        miLista.ModifyData(2, 4);
        System.out.println("List with an element modified: " + miLista.showData());
        miLista.SpecificDelete(4);
        //List without an specific element.
        System.out.println("List updated: " + miLista.showData());
        //List with new node inserted right after an specific node.
        miLista.InsertAfter(1278, 2);
        //The list will have added a new node right after an specific node.
        System.out.println("New list: " + miLista.showData());
        //You will see the list length
        System.out.println("The list length is: "+miLista.ListLength());
        
          SinglyLinkedList<Integer> miLista1 = new SinglyLinkedList<>();
//        miLista1.add(99);
//        miLista1.add(88);
//        miLista1.add(33);
//        miLista1.add(11);
//        miLista1.add(23);
//        miLista1.add(22);
//        miLista1.add(2);
//        miLista1.add(4);
//You will see as true or false statement if the list are identical.
        System.out.println("Are the lists identical?  "+miLista.SameLists(miLista, miLista1));
    }
}
