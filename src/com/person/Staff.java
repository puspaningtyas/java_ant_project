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
public class Staff extends Person{
    private String staffId;

    public Staff() {
    }

    public Staff(String staffId) {
        this.staffId = staffId;
    }

    public Staff(String staffId, String name) {
        super(name);
        this.staffId = staffId;
    }

    public Staff(String staffId, String name, String socialNumber) {
        super(name, socialNumber);
        this.staffId = staffId;
    }
    
}
