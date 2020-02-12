/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author cano2030
 * @param <T>
 */
public interface Ilist<T> {

    /*
    *Agregar un dato al inicio
    *@param el dato
     */
    public void add(T d);

    /*
    *Agregar un dato al final
    *@param el dato
     */
    public void addLast(T d)throws Exception;

    /*
    *Agregar un dato ordenado de menor a mayor
    *@param el dato
     */
    public void addOrdered(T d);

    /*
    *Verificar si la lista esta vacia
    *@return verdadero si esta vacia
     */
 /*
    *Borrar un dato al inicio
    *@param el dato
     */
    public void AddorderedFromHigh(T d)throws Exception;
        /*
    *Verify if list is Empty
    *@return true if It is
     */
 /*
    *Borrar un dato al inicio
    *@param el dato
     */
    public void delete() throws Exception;

    /*
    *Borrar un dato al final
    *@param el dato
     */
    public void deleteLast() throws Exception;

    public boolean isEmpty();

    /*
    *Mostrar todos los datos de la lista
    *@return String con todos los datos
     */
    public String showData();

}
