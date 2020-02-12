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
public class SinglyLinkedList<T extends Comparable> implements Ilist<T> { 

    private Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    @Override
    public void add(T d) {
        //crear el nuevo nodo
        //el siguiente del nuevo nodo = cabeza
        //actualizar cabeza = nuevo nodo

        Node<T> newNode = new Node<>(d);
        newNode.setNextNode(this.head);
        this.head = newNode;

    }

    @Override
    public void addOrdered(T d) {
        /*
        Crear un nodo para el nuevo dato.
        Si la lista esta vacía, o el valor del primer elemento de la lista 
        es mayor que el nuevo, insertar el nuevo nodo en la primera posición 
        de la lista y modificar la cabecera respectivamente.
        
         */

        Node<T> newNode = new Node<>(d);
        if (isEmpty() || d.compareTo(this.head.getData()) == -1) {
            newNode.setNextNode(this.head);
            this.head = newNode;
        } else {
            /* 
        Si no se cumple el caso anterior, buscar el lugar adecuado 
            para la inserción: recorrer la lista conservando el nodo actual. 
            Inicializar nodo actual con el valor de primera posición, 
            y avanzar mientras el siguiente nodo no sea nulo y el dato 
            que contiene la siguiente posición sea menor o igual que 
            el dato a insertar.

             */
            Node<T> current = this.head;//
            while (current.getNextNode() != null
                    && d.compareTo(current.getNextNode().getData()) == 1) {
                current = current.getNextNode();
            }
            /*
            Con esto se señala al nodo adecuado, 
            a continuación insertar el nuevo nodo a continuación de él.
             */

            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);

        }

    }

    @Override
    //To verify if it is Empty.
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    //Here you can show all data.
    public String showData() {
        String data = "";
        Node<T> current = this.head;
        while (current != null) {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }
//This method is for counting all nodes storage

    public int DataCounter() {
        int data = 0;
        Node<T> current = this.head;
        while (current != null) {
            data++;
            current = current.getNextNode();
        }
        return data;
    }
//This method is to get the Highest node in the list.

    public T Max() {
        T max = this.head.getData();
        Node<T> current = this.head;

        while (current != null) {
            if (max.compareTo(current.getData()) == -1) {
                max = current.getData();
            }
            current = current.getNextNode();
        }
        return max;
    }
//This method is to get the Smallest node in the list.

    public T Min() {
        T min = this.head.getData();
        Node<T> current = this.head;

        while (current != null) {
            if (min.compareTo(current.getData()) == 1) {
                min = current.getData();
            }
            current = current.getNextNode();
        }
        return min;
    }

    //In this method is where you can get the nodes average.
    public double Average() {
        double average;
        int acum = 0, n = 0;
        Node<T> current = this.head;
        while (current != null) {
            n++;
            acum += (int) current.getData();
            current = current.getNextNode();
        }
        average = acum / n;
        return average;
    }
//This Method is for searching an especific node in the List.

    public void Search(T number) {
        Node<T> current = this.head;
        while (current != null) {
            if (number == current.getData()) {
                System.out.println("The Data has been found!!!");
                break;
            }
            if (number != current.getData() && current.getNextNode() == null) {
                System.out.println(number + " is an inexistent Data");
            }
            current = current.getNextNode();
        }
    }

    /**
     *
     * @param d
     * @throws Exception
     */
    @Override
    //This method as the name says will add a node at the end as the new head.
    public void addLast(T d) throws Exception {
        if (isEmpty()) {
            add(d);
        } else {
            Node<T> newNode = new Node<>(d);
            Node<T> current = this.head;
            while (current.getNextNode() != null) {
                if (d == current.getData()) {
                    throw new Exception(d + " has been already added");
                }
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }
//This method is to add Data Ordered from Higher to Menor

    /**
     *
     * @param d
     * @throws Exception
     */
    @Override
    public void AddorderedFromHigh(T d) throws Exception {
        Node<T> newNode = new Node<>(d);
        if (isEmpty() || d.compareTo(this.head.getData()) == 1) {
            newNode.setNextNode(this.head);
            this.head = newNode;
        } else {
            Node<T> current = this.head;
            while (current.getNextNode() != null
                    && d.compareTo(current.getData()) == -1) {
                if (d == current.getData()) {
                    throw new Exception(d + " has been already added");
                }
                current = current.getNextNode();
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
        }
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            this.head = head.getNextNode();
        }
    }

    @Override
    //This method will delete the last node, and as everyone knows is the current head.
    public void deleteLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            Node<T> current = this.head;
            while (current.getNextNode().getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(null);
        }

    }
//This method is to modify any node, you need to give the previous node of it.

    public void ModifyData(T dNew, T dOld) {
        Node<T> current = this.head;
        while (current.getData() != dOld) {
            current = current.getNextNode();
        }
        current.setData(dNew);
    }
//This Method will delete an Specific node from the list.
    public void SpecificDelete(T d) {
        Node<T> current = this.head;
        if (current.getData() == d) {
            this.head = current.getNextNode();
        } else {
            while (current.getNextNode().getData() != d) {
                current = current.getNextNode();
            }
            current.setNextNode(current.getNextNode().getNextNode());
        }
    }
//This method will add a node right after an specific node that already exists.
    public void InsertAfter(T dAfter, T dBefore) {
        Node<T> current = this.head;
        Node<T> newNode = new Node<>(dAfter);
        if (isEmpty()) {
            add(dAfter);
        }
        while (current.getData() != dBefore) {
            current = current.getNextNode();
        }
        current.setNextNode(newNode);
        newNode.setNextNode(current.getNextNode().getNextNode());
    }
//This method will return the length of an specific list.
    public int ListLength() {
        Node<T> current = this.head;
        int cont = 0;
        while (current.getNextNode() != null) {
            cont++;
            current = current.getNextNode();
        }
        return cont;
    }
//The method will return a true or false statement to define if the machine are identical.
    public boolean SameLists(SinglyLinkedList<Integer> dfirst, SinglyLinkedList<Integer> d) {
        Node<T> current = this.head;
        Node<T> contemporary = this.head;
        if (d.isEmpty() || dfirst.isEmpty()) {
            return false;
        }
        if (d.ListLength() != dfirst.ListLength()) {
            return false;
        }
        while (current.getData() != contemporary.getData()) {

            if (current.getData() != contemporary.getData()) {
                return false;
            }
            current.getNextNode();
            contemporary.getNextNode();
        }
        return true;
    }

}
