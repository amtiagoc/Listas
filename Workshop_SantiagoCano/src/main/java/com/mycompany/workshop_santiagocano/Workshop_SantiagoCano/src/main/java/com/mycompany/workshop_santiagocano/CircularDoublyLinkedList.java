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
public class CircularDoublyLinkedList<T extends Comparable> {

    DoubleNode<T> head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    public void add(T d) {
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (IsEmpty()) {
            head = newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.setPreviousNode(newNode);
            head = newNode;
            head.getPreviousNode().setNextNode(head);

        }
    }

    public void addLast(T d) {
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (IsEmpty()) {
            head = newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.getPreviousNode().setNextNode(newNode);
            head.setPreviousNode(newNode);
        }
    }

    public void addOrdered(T d) {
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (IsEmpty() || d.compareTo(this.head.getData()) == 1) {
            add(d);
        } else {
            DoubleNode<T> current = this.head;
            while (d.compareTo(current.getNextNode().getData()) == -1 && current.getNextNode() != head) {
                current = current.getNextNode();
            }
            if (current == head.getPreviousNode()) {
                addLast(d);
            } else {
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
            }
        }
    }

    public void Delete() throws Exception {
        if (IsEmpty()) {
            throw new Exception("No existen datos por borrar...");
        } else if (head == head.getPreviousNode()) {
            head = null;
        } else {
            head.getNextNode().setPreviousNode(head.getPreviousNode());
            head.getPreviousNode().setNextNode(head.getNextNode());
            head = head.getNextNode();
        }
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public String ShowData() {
        String data = "";
        DoubleNode<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        } while (current != head);
        return data;
    }

    public boolean Exist(T name) {
        if (IsEmpty()) {
            return false;
        } else {
            DoubleNode<T> current = this.head;
            do {
                if (current.getData().compareTo(name) == 0) {
                    return true;
                }
                current = current.getNextNode();
            } while (current != head);
            return false;
        }
    }

    public DoubleNode<T> ItExist(T d) throws Exception {
        if (IsEmpty()) {
            throw new Exception("It is empty");
        } else {
            DoubleNode<T> current = this.head;
            while (current.getNextNode() != head) {
                if (current.getData().compareTo(d) == 0) {
                    return current;
                }
                current = current.getNextNode();
            }
            return null;
        }
    }

    public CircularDoublyLinkedList<T> DivideList(T d) {
        try {
            DoubleNode<T> current = ItExist(d);
            if (current == null) {
                System.out.println("No existe ese dato");
            } else {
                CircularDoublyLinkedList<T> newList = new CircularDoublyLinkedList<>();
                while (current != head) {
                    newList.addLast(current.getData());
                    current = current.getNextNode();
                }
                return newList;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
