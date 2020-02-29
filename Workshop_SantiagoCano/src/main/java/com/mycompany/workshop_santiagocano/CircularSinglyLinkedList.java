/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.workshop_santiagocano;

/**
 *
 * @author scd
 * @param <T>
 */
public class CircularSinglyLinkedList<T extends Number & Comparable> {

    Node<T> head;
    Node<T> tail;

    public CircularSinglyLinkedList() {
        head = tail = null;
    }

    private Node<T> addNode(T d) {
        Node<T> newNode = new Node<>(d);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.setNextNode(newNode);
        } else {
            newNode.setNextNode(head);
            tail.setNextNode(newNode);
        }
        return newNode;
    }

    public void add(T d) {
        head = addNode(d);
    }

    public void addLast(T d) {
        tail = addNode(d);
    }

    public void addOrdered(T d) {
        Node<T> newNode = new Node<>(d);
        if (isEmpty() || d.compareTo(this.head.getData()) == 1) {
            add(d);
        } else {
            Node<T> current = this.head;
            while (d.compareTo(current.getNextNode().getData()) == -1 && current.getNextNode() != head) {
                current = current.getNextNode();
            }
            if (current == tail) {
                addLast(d);
            } else {
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
            }
        }
    }

    public void delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar...");
        } else if (head == tail) {
            head = null;
        } else {
            tail.setNextNode(head.getNextNode());
            head = head.getNextNode();
        }
    }

    public void deleteLast() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String showData() {
        String data = "";
        Node<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        } while (current != head);
        return data;
    }

    public String Browsing(T d) throws Exception {
        Node<T> current = this.head;
        String list = "";
        if (isEmpty()) {
            throw new Exception("The list cannot be explored, because there is no data to be shown.");
        } else {
            if (current == null) {
                return "This list does not have this reference node.";
            } else if (current == head) {
                return showData();
            } else {
                while (current != head) {
                    list += " " + current.getData();
                    current = current.getNextNode();
                }
                return list;
            }
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public String MergingLists(CircularSinglyLinkedList a, CircularSinglyLinkedList b) {
        if (a == null) {
            return a.showData();
        } else if (b == null) {
            return b.showData();
        } else {
            return a.showData() + "" + b.showData();
        }
    }
}
