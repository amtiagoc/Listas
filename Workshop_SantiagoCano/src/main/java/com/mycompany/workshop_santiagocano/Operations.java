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
public class Operations<T> {

    DoubleSong<T> head;

    public Operations() {
        head = null;
    }

    public void AddSong(T d) {
        DoubleSong<T> newSong = new DoubleSong<>(d);
        if (IsEmpty()) {
            head = newSong;
            newSong.setNextSong(newSong);
            newSong.setPreviousSong(newSong);
        } else {
            newSong.setPreviousSong(head.getPreviousSong());
            newSong.setNextSong(head);
            head.setPreviousSong(newSong);
            head = newSong;
            head.getPreviousSong().setNextSong(head);
        }
    }

    public boolean IsEmpty() {
        return head == null;
    }
    
    public String showData(){
    String data = "";
         DoubleSong<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextSong();
        } while (current != head);
        return data;
    }
}
