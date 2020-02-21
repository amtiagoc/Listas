/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author scd
 */
public class Student{
    
    private String id;
    private String Neighborhood;
    private String name;
    private double grade;
    
    /**
     *
     * @param id
     * @param name
     * @param Neighborhood
     * @param grade
     */

    public Student(String id,String name, String Neighborhood,double grade) 
    {
        this.id = id;
        this.name = name;
        this.Neighborhood = Neighborhood;
        this.grade = grade;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the Neighborhood
     */
    public String getNeighborhood() {
        return Neighborhood;
    }

    /**
     * @param Neighborhood the Neighborhood to set
     */
    public void setNeighborhood(String Neighborhood) {
        this.Neighborhood = Neighborhood;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }
}
