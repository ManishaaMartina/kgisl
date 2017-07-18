package com.mycompany.app;
public class Main
{
    public static void main (String[] args)
    {
        StudentJDBC stu=new StudentJDBC();
        Student m=new Student();
        m.setName("manis");
        m.setRollnum(6);
        m.setCourse("BE");
        Student k=new Student();
        k.setName("kishore");
        k.setRollnum(7);
        stu.add(m);
        stu.delete(4);
        stu.update(k);
        stu.findAll();
    }
}