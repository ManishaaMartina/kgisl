package com.mycompany.app;
import java.io.Serializable;
public class Student implements Serializable
{
    int rollnum;
    String name;
    String course;
    String address;
public Student(){}
public Student(int roll,String name,String course,String address)
{
this.rollnum=roll;
this.name=name;
this.course=course;
this.address=address;
}
public int getRollnum()
{
    return rollnum;
}
public void setRollnum(int rollnum)
{
    this.rollnum=rollnum;
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name=name;
}
public String getCourse()
{
    return course;
}
public void setCourse(String course)
{
    this.course=course;
}
public String getAddress()
{
    return address;
}
public void setAddress(String address)
{
    this.address=address;
}
}
