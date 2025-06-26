/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.person;

/**
 *
 * @author user
 */
public class Lecture extends Staff{
    private String lectureId;

    public Lecture() {
    }

    public Lecture(String lectureId) {
        this.lectureId = lectureId;
    }

    public Lecture(String lectureId, String staffId) {
        super(staffId);
        this.lectureId = lectureId;
    }

    public Lecture(String lectureId, String staffId, String name) {
        super(staffId, name);
        this.lectureId = lectureId;
    }

    public Lecture(String lectureId, String staffId, String name, String socialNumber) {
        super(staffId, name, socialNumber);
        this.lectureId = lectureId;
    }



    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
        this.lectureId = lectureId;
    }
    
    
}
