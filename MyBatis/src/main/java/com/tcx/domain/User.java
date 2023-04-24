package com.tcx.domain;

public class User {
    private int Id;
    private String StuClass;
    private String StuName;
    private String Sex;
    private int Age;

    public User(){}

    public User(int id, String stuClass, String stuName, String sex, int age) {
        Id = id;
        StuClass = stuClass;
        StuName = stuName;
        Sex = sex;
        Age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStuClass() {
        return StuClass;
    }

    public void setStuClass(String stuClass) {
        StuClass = stuClass;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", StuClass='" + StuClass + '\'' +
                ", StuName='" + StuName + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Age=" + Age +
                '}';
    }
}
