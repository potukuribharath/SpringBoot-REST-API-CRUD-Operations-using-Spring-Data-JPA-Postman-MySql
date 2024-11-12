package com.newdemo.firstapp;


import jakarta.persistence.*;


@Entity
@Table(name="Student")
public class Student {

//    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    @Id
    private int RollNo;
    @Column(name="Studnt_name")    //we can write name of the column here its an option
    private String Name;
    @Column(name="Std_percentage")
    private float percentage;
    @Column(name="std_branch")
    private String branch;

    public Student(int rollNo, String name, float percentage, String branch) {
        RollNo = rollNo;
        Name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    public Student() {

    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }
}
