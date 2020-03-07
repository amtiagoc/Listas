/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s103e28
 */
public class ArrayStack implements IStack<Object> {

    private Object[] data;
    private int max;
    private int top;
    private int tail;

    public ArrayStack(int n) {
        max = n;
        top = 0;
        data = new Object[n];
    }

    public boolean isFull() {

        return top - tail == 1;
    }

    @Override
    public boolean empty() {
        return top == 0;
    }

    @Override
    public Object peek() {
        return data[top - 1];
    }

    @Override
    public Object pop() {
        if (empty()) {
            return null;
        } else {
            Object dataTemp = data[--top];
            data[top] = null;
            return dataTemp;
        }
    }

    @Override
    public Object push(Object item) {

        if (top == max) {
            return null;
        } else {
            data[top++] = item;
            return item;
        }
    }

    public Object popright() {
        if (empty()) {
            return null;
        } else if (top == 0) {
            return null;
        } else {
            Object dataTemp = data[--top];
            data[top] = null;
            return dataTemp;
        }
    }

    public Object popdleft() {
        if (empty()) {
            return null;
        } else if (tail == max - 1) {
            return null;
        } else {
            Object dataTemp = data[++tail];
            data[tail] = null;
            return dataTemp;
        }
    }

    public Object pushleft(Object item) {
        if (isFull()) {
            return null;
        } else if (top == tail && data[top] != null) {
            return null;
        } else {
            data[top++] = item;
            return item;
        }
    }

    public Object pushright(Object item) {
        if (isFull()) {
            return null;
        } else if (top == tail && data[top] != null) {
            return null;
        } else {
            data[tail--] = item;
            return item;
        }
    }

    @Override
    public int search(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
