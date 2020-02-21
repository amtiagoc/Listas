/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author scd
 * @param <T>
 */
public class DoubleStudentList<T extends Student> implements Ilist<T> {

    private DoubleStudent<T> head;
    private DoubleStudent<T> tail;

    public DoubleStudentList() {
        head = tail = null;
    }

    /**
     *
     * @param d
     * @throws java.lang.Exception
     */
    @Override
    public void add(T d) throws Exception {
        if (isEmpty()) {
            head = tail = new DoubleStudent<>(d, null, null);
        }
        else{
            if(IfAlreadysThere(d.getId()))throw new Exception("My apologizes, But This ID has already been added, try again with a different one :(");
            if(d.getGrade() > 5)
            {throw new Exception("Please The grade it  is a value between 1 and 5 ");}
             if (d.getGrade() > 3) {
                head = new DoubleStudent<>(d, null, head);
                head.getNextStudent().setPreviousStudent(head);
            } else {
                tail = new DoubleStudent<>(d, tail, null);
                tail.getPreviousStudent().setNextStudent(tail);
            }
        }
    }

    @Override
    public void addLast(T d) {
        if (!isEmpty()) {
            head = tail = new DoubleStudent<>(d);
        } else {
            tail = new DoubleStudent<>(d);
            tail.getPreviousStudent().setNextStudent(tail);
        }

    }

    @Override
    public void addOrdered(T d) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLast() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String showData() {
        String data = "";
        DoubleStudent<T> current = this.head;
        while (current != null) {
            data = data + current.getStudent().getId() + " " + current.getStudent().getName() + "  " + current.getStudent().getNeighborhood() + "  "
                    + current.getStudent().getGrade() + " ->   ";
            current = current.getNextStudent();
        }
        return data;
    }
//Find out if a neighborhood exist.
    public boolean IfAlreadysThere(String d) {
        DoubleStudent<T> current = this.head;
        while (current != null) {
            if (current.getStudent().getId() == d) return true;
            else if(current.getStudent().getNeighborhood() == d)return true;
            current = current.getNextStudent();
        }
        return false;
    }

    public String searchData(String d) throws Exception {
        DoubleStudent<T> current = this.head;
        String data = "";
        while (current != null) {
            if (current.getStudent().getId() == d) {
                data += current.getStudent().getId() + " " + current.getStudent().getName() + " " + current.getStudent().getNeighborhood() + " "
                        + current.getStudent().getGrade() + " ";
                break;
            } else if (current.getStudent().getId() != d && current.getNextStudent() == null) {
                throw new Exception("This ID has not been found it :(");
            }
            current = current.getNextStudent();
        }
        return data;
    }
//  Find who lives in an specifikc neighborhood.
    public String SearchNear(String d) throws Exception {
        DoubleStudent<T> current = this.head;
        String data = "";
        while (current != null) {
            if (current.getStudent().getNeighborhood().equals(d)) {
                data += current.getStudent().getName() + "  ->  ";
            } 
            current = current.getNextStudent();
        }
        if(IfAlreadysThere(d)==false) {
            throw new Exception("This neighborhood has not been found it :(");
            }
        return data;
    }
//If the grade is less than  3, it will create a list to add this students.
    public void LoserList() throws Exception {
        DoubleStudent<T> current = this.head;
        DoubleStudentList<Student> Losers = new DoubleStudentList<>();
        while (current != null) {
            if (current.getStudent().getGrade() < 3) {
                Losers.add(current.getStudent());
            }
            current = current.getNextStudent();
        }
        System.out.println("Students that have lost the subject :(");
        System.out.println(Losers.showData());
    }
//If the grade is greater than or equal to 3, it will create a list to add this students
    public void WinnerList() throws Exception {
        DoubleStudent<T> current = this.head;
        DoubleStudentList<Student> Winners = new DoubleStudentList<>();
        while (current != null) {
            if (current.getStudent().getGrade() >= 3) {
                Winners.add(current.getStudent());
            }
            current = current.getNextStudent();
        }
        System.out.println("Students that have passed the subject :)");
        System.out.println(Winners.showData());
    }
}
