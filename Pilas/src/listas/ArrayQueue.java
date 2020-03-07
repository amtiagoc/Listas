/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author niwdeyen
 */
public class ArrayQueue implements IQueue<Object> {

    private Object[] ArrayQ;
    private int max, head, tail, totalN;

    public ArrayQueue(int n) {
        ArrayQ = new Object[n];
        head = tail = totalN = 0;
        max = n;
    }

    public boolean empty() {
        return totalN == 0;
    }

    public boolean full() {
        return totalN == max;
    }
    @Override
    public boolean offer(Object e) {
        if (full()) {
            return false;
        } else if (tail == max && head != 0) {
            ArrayQ[0] = e;
            tail=1;
        } else {
            ArrayQ[tail++] = e;
        }
        totalN++;
        return true;    }

    @Override
    public Object remove() throws Exception {
        Object dataTemp;
        if (empty()) {
            throw new Exception("Empty Queue");
        } else if (head == max) {
            dataTemp = ArrayQ[0];
            ArrayQ[0] = null;
            head = 1;            
        } else {
            dataTemp = ArrayQ[head];
            ArrayQ[head++] = null;
        }
        totalN--;
        return dataTemp;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object poll() {
         Object dataTemp;
        if (empty()) {
            return null;
        } else if (head == max) {
            dataTemp = ArrayQ[0];
            ArrayQ[0] = null;
            head = 1;            
        } else {
            dataTemp = ArrayQ[head];
            ArrayQ[head++] = null;
        }
        totalN--;
        return dataTemp;
    }

    @Override
    public Object element() throws Exception {
                 if(empty()){throw new Exception("Mala tuya");}
                 else{
                 return ArrayQ[totalN];
                 }
    }

    @Override
    public Object peek() {
        if(empty()){return null;}
                 else{
                 return ArrayQ[totalN];
                 }
    }

    @Override
    public boolean add(Object e) throws Exception {
     if (full()) {
            throw new Exception("Empty list");
        } else if (tail == max && head != 0) {
            ArrayQ[0] = e;
            tail=1;
        } else {
            ArrayQ[tail++] = e;
        }
        totalN++;
        return true;   
    }

}
