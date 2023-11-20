package com.sprint.inheritance;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name,double salary){
        super(id,name,salary);
    }

    public void work(){
        setSalary(32000);
        System.out.println(getName()+"JuniorDeveloper start to work");
    }
}
