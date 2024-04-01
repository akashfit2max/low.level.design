package com.akash.low.level.design.designpatterns.Structural.proxy;

public class Main {
    public static void main(String[] args) {
        EmplyeeDaoProxy emplyeeDaoProxy = new EmplyeeDaoProxy();
        Employee employee = new Employee();
        employee.setAge(11);
        employee.setName("aska");
        emplyeeDaoProxy.create(employee);

    }
}
