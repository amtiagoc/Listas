/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author cano2
 * @param <T>
 */
public class DoubleStudent<T extends Student> {

    private T Student;
    private DoubleStudent<T> nextStudent;
    private DoubleStudent<T> previousStudent;

    public DoubleStudent(T d, DoubleStudent ps, DoubleStudent ns) {
        setStudent(d);
        setPreviousStudent(ps);
        setNextStudent(ns);
    }

    public DoubleStudent(T d) {
        this(d, null, null);
    }

    /**
     * @return the nextStudent
     */
    public DoubleStudent<T> getNextStudent() {
        return nextStudent;
    }

    /**
     * @param nextStudent the nextStudent to set
     */
    public void setNextStudent(DoubleStudent <T>nextStudent) {
        this.nextStudent = nextStudent;
    }

    /**
     * @return the previousStudent
     */
    public DoubleStudent<T> getPreviousStudent() {
        return previousStudent;
    }

    /**
     * @param previousStudent the previousStudent to set
     */
    public void setPreviousStudent(DoubleStudent<T> previousStudent) {
        this.previousStudent = previousStudent;
    }

    /**
     * @return the Student
     */
    public T getStudent() {
        return Student;
    }

    /**
     * @param Student the Student to set
     */
    public void setStudent(T Student) {
        this.Student = Student;
    }

}
