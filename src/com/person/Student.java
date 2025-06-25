/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person;

/**
 *
 * @author puspa
 */
public class Student extends Person{
    private String studentId;

    public Student() {
    }

    public Student(String name) {
        super(name);
    }
    
    public Student(String name,String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
