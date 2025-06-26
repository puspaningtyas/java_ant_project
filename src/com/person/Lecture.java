/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.person;

/**
 *
 * @author user
 */
public class Lecture extends Person{
    private String lectureId;

    public Lecture(String lectureId) {
        this.lectureId = lectureId;
    }

    public Lecture(String lectureId, String name) {
        super(name);
        this.lectureId = lectureId;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }
    
    
}
