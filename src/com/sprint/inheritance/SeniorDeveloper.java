package com.sprint.inheritance;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(100000);
        System.out.println(getName()+"SeniorDeveloper start to work");
    }
}
