package com.sprint.inheritance;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName()+"MidDeveloper start to work");
    }
}
