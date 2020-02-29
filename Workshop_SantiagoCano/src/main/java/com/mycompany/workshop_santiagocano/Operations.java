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
public class Operations<T extends Comparable> {

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
    
    public String  ShowData(){
    String data = "";
         DoubleSong<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextSong();
        } while (current != head);
        return data;
    }

    public boolean Exist(T name){
        if(IsEmpty()){
            return false;
        } else {
            DoubleSong<T> current = this.head;
            do{
                if(current.getData().compareTo(name) == 0){
                    return true;
                }
                current = current.getNextSong();
            } while (current != head);
            return false;
        }
    }
         public String ShowPlayList() {
        String data = "";
        DoubleSong<T> current = this.head;
        do {
            data += current.getData()+ " \n ";
            current = current.getNextSong();
        } while (current != head);
        return data;
    }
     
         public void Delete() throws Exception {
        if (IsEmpty()) {
            throw new Exception("There are no data available to delete...");
        } else if (head == head.getPreviousSong()) {
            head = null;
        } else {
            head.getNextSong().setPreviousSong(head.getPreviousSong());
            head.getPreviousSong().setNextSong(head.getNextSong());
            head = head.getNextSong();
        }
    }
         public void DeleteLast() throws Exception {
        if(IsEmpty()){
            throw new Exception("The list is empty...");
        } else if (head==head.getPreviousSong()){
            head = null;
        } else {
            DoubleSong<T> current = this.head;
            while(current.getNextSong() != head.getPreviousSong()){
                current = current.getNextSong();
            }
          current.setNextSong(head);
            head.setPreviousSong(current);
        }
    }

    public void DeleteSong(T name) throws Exception {
        if (IsEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else if (head == head.getPreviousSong()) {
            head = null;
        } else if (!Exist(name)){
            throw new Exception("El dato no existe en la play list");
        } else {
            DoubleSong<T> current = this.head;
            if(name.compareTo(head.getData()) == 0){
                Delete();
            } else if(name.compareTo(head.getPreviousSong().getData()) == 0){
                DeleteLast();
            }
            do{
                if(current.getNextSong().getData().compareTo(name) == 0){
                    current.setNextSong(current.getNextSong().getNextSong());
                }
                current = current.getNextSong();
            } while (current != head && current != head.getPreviousSong());
        }
    }
    
    public void update(T name, T newName) throws Exception{
        if(IsEmpty()){
            throw new Exception("There are no songs available to update, because is empty...");
        } else if (!Exist(name)){
            throw new Exception("That song does not exist...");
        } else {
            DoubleSong<T> current = this.head;
            do {
                if(current.getData().compareTo(name) == 0){
                    current.setData(newName);
                } 
                current = current.getNextSong();
            } while (current != head);
        }
    }
        public String autoPlay(){
        String data ="";
        DoubleSong<T> current = this.head;
        do{
            data += current.getData()+ " ";
            current = current.getNextSong();
            
        } while (current != head);
        return data;
    }
         
}
