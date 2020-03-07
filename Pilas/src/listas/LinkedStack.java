/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s103e28
 * @param <E>
 */
public class LinkedStack<E> implements IStack<E> {

    private Node<E> top, root, tail;
    private int sizeStack;

    public LinkedStack() {
        top = null;
        tail = null;
        sizeStack = 0;
        root = new Node<>((E) "raiz");

    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public E peek() {

        return (empty()) ? null : top.getData();

//        if(empty()){
//            return null;
//        }else{
//            return top.getData();
//        }
    }

    @Override
    public E pop() {
        if (empty()) {
            return null;
        } else {
            E dataTemp = top.getData();
            top = (top.getNextNode() == null) ? null : top.getNextNode();
//            if (top.getNextNode()==null){
//                top=null;
//            }else{
//                top = top.getNextNode();
//            }

            sizeStack--;
            return dataTemp;
        }
    }

    @Override
    public E push(E item) {
        sizeStack++;
        top = new Node<E>(item, top);
        return item;
    }

    public E pop1() {
        if (top == null) {
            return null;
        } else {
            E dataTemp = top.getData();
            top = (top.getNextNode() == root) ? null : top.getNextNode();
            sizeStack--;
            return dataTemp;
        }
    }

    public E pop2() {

        if (tail == null) {
            return null;
        } else {
            E dataTemp = tail.getData();
            tail = (tail.getNextNode() == root) ? null : tail.getNextNode();
            sizeStack--;
            return dataTemp;
        }
    }
     public E push1(E item) {

        if (top == null) {
            top = new Node<E>(item, root);
        } else {
            top = new Node<E>(item, top);
        }
        sizeStack++;
        return item;
    }

    public E push2(E item) {

        if (tail == null) {
            tail = new Node<E>(item, root);
        } else {
            tail = new Node<E>(item, tail);
        }
        sizeStack++;
        return item;
    }

    @Override
    public int search(E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
