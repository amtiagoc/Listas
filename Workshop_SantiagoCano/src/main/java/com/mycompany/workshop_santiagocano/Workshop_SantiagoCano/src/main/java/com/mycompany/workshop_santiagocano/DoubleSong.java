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
public class DoubleSong<T> {
        private T data;
    private DoubleSong<T> nextSong;
    private DoubleSong<T> previousSong;
        
    public DoubleSong(T d,DoubleSong ps, DoubleSong ns){
        setData(d);
        setPreviousSong(ps);
        setNextSong(ns);
    }
    
    public DoubleSong(T d){
       this(d,null,null) ;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the nextSong
     */
    public DoubleSong<T> getNextSong() {
        return nextSong;
    }

    /**
     * @param nextSong the nextSong to set
     */
    public void setNextSong(DoubleSong nextSong) {
        this.nextSong = nextSong;
    }

    /**
     * @return the previousSong
     */
    public DoubleSong<T> getPreviousSong() {
        return previousSong;
    }

    /**
     * @param previousSong the previousSong to set
     */
    public void setPreviousSong(DoubleSong previousSong) {
        this.previousSong = previousSong;
    }
}
