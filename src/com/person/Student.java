/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person;

/**
 *
 * @author puspa
 * update pass token git
 */
public class Student extends Person{
    private String studentId;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String name) {
        super(name);
        this.studentId = studentId;
    }

    public Student(String studentId, String name, String socialNumber) {
        super(name, socialNumber);
        this.studentId = studentId;
    }

 
}
