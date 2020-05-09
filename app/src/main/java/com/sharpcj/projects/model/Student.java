package com.sharpcj.projects.model;

public class Student {
    private int mStuId;
    private String mName;
    private int mAge;

    public Student() {
    }

    public Student(int stuId, String name, int age) {
        this.mStuId = stuId;
        this.mName = name;
        this.mAge = age;
    }

    public int getId() {
        return mStuId;
    }

    public void setId(int stuId) {
        this.mStuId = stuId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        this.mAge = age;
    }
}
