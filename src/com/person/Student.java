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
    private String id;

    public Student() {
    }

    public Student(String name) {
        super(name);
    }
    
    public Student(String name,String id) {
        super(name);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
