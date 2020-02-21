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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        DoublyLinkedList<Integer> myDoublelist = new DoublyLinkedList<>();
        try {
            myDoublelist.addOrdered(66);
            myDoublelist.addOrdered(11);
            myDoublelist.addOrdered(99);
            myDoublelist.addOrdered(33);
            myDoublelist.addOrdered(44);
            myDoublelist.addOrdered(22);
            myDoublelist.addOrdered(101);
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(myDoublelist.showData());
        System.out.println(myDoublelist.searchData(77));
        System.out.println(myDoublelist.showData());
        try {
            myDoublelist.deleteLast();
            myDoublelist.deleteLast();
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(myDoublelist.showData());
        System.out.println(myDoublelist.showDataReverse());
        myDoublelist.specificDelete(66);
        System.out.println("List without node:  " + myDoublelist.showData());
        try {
            myDoublelist.InsertNode(4, 44);
            System.out.println("New list: " + myDoublelist.showData());
            System.out.println("\r");

        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
//Practice Part ------------------------------------------------------------------------------------------------------------------------------------

        DoubleStudentList<Student> myStudentlist = new DoubleStudentList<>();
        Student st1 = new Student("123", "Email", "Medallo", 3);
        Student st2 = new Student("456", "Hitler", "Alemania", 1);
        Student st3 = new Student("7", "Friendzone", "Paris", 5);
        myStudentlist.add(st1);
        myStudentlist.add(st2);
        myStudentlist.add(st3);
        System.out.println("The list is: " + myStudentlist.showData());
        System.out.println("Search: " + myStudentlist.searchData("456"));
        System.out.println("Students that live in: " + myStudentlist.SearchNear("Paris"));
        myStudentlist.WinnerList();
        myStudentlist.LoserList();
    }
}
