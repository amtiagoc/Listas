/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.workshop_santiagocano;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cano2
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // First Part
        CircularSinglyLinkedList<Integer> myCSLL = new CircularSinglyLinkedList<>();
        myCSLL.addOrdered(9);
        myCSLL.addOrdered(2);
        myCSLL.addOrdered(7);
        myCSLL.addOrdered(8);}
        System.out.println("Current list: " + myCSLL.showData());
        CircularSinglyLinkedList<Integer> myCSLL2 = new CircularSinglyLinkedList<>();
        myCSLL2.addOrdered(5);
        myCSLL2.addOrdered(10);
        myCSLL2.addOrdered(11);
        System.out.println("Second list: " + myCSLL2.showData());
        String merging = myCSLL.MergingLists(myCSLL, myCSLL2);
        System.out.println("The result of the lists merged: " + merging);
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //Second Part
        CircularDoublyLinkedList<Integer> myCDLL = new CircularDoublyLinkedList<>();
        myCDLL.addOrdered(1);
        myCDLL.addOrdered(6);
        myCDLL.addOrdered(17);
        myCDLL.addOrdered(3);
        myCDLL.addOrdered(5);
        System.out.println(myCDLL.ShowData());
        System.out.println(myCDLL.Exist(5));
        myCDLL.DivideList(17);
        System.out.println("The divide list is"+ myCDLL.ShowData());
        //---------------------------------------------------------------------------------------------------------------------------------------------
        //Practice Case
                Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String nombreCancion = "", nombreCancion2 = "";

        System.out.println("Lista de Reproduccion de video \n");
        System.out.println("Seleccione la opcion que desea realizar del 1 al 6: \n");
        System.out.println("1. Agregar cancion \n");
        System.out.println("2. Eliminar \n");
        System.out.println("3. Actualizar \n");
        System.out.println("4. Ver PlayList \n");
        System.out.println("5. Reproduccion automatica \n");
        System.out.println("6. Salir \n");
        opcion = teclado.nextInt();
        Operations<String> Music = new Operations<>();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre de la cancion: ");
                nombreCancion = teclado.nextLine();
                Music.AddSong(nombreCancion);
            case 2:
                System.out.println("Ingrese el nombre de la cancion que desea eliminar: ");
                nombreCancion = teclado.nextLine();
                try {
                    Music.DeleteSong(nombreCancion);
                } catch (Exception ex) {
                    Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
                }
            case 3:
                System.out.println("Ingrese el nombre de la cancion que desea cambiar: \n");
                nombreCancion = teclado.nextLine();
                System.out.println("Ingrese el nombre de la nueva cancion: ");
                nombreCancion2 = teclado.nextLine();
                try {
                    Music.update(nombreCancion, nombreCancion2);
                } catch (Exception ex) {
                    Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
                }
            case 4:
                System.out.println("La playList: \n" + Music.ShowPlayList());
            case 5:
                System.out.println(Music.autoPlay());
            case 6:
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        Music.AddSong("What if i told you that i love you");
        Music.AddSong("Me Gusta la sopa con Pollo");
        Music.AddSong("Musica Ligera");
        Music.AddSong("Blanco");
        System.out.println("VER LISTA " + " \n " + Music.ShowPlayList());
        try {
            Music.DeleteSong("Acapella");
        } catch (Exception ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Music.update("Tatto", "Sweet Child'O Mine");
        } catch (Exception ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("The current Playlist:  " + " \n " + Music.ShowPlayList());
    }
}
