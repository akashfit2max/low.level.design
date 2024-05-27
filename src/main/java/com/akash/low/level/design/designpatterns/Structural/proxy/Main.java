package com.akash.low.level.design.designpatterns.Structural.proxy;

public class Main {

    // provide controlled access to original object
    public static void main(String[] args) {
        EmplyeeDaoProxy emplyeeDaoProxy = new EmplyeeDaoProxy();
        Employee employee = new Employee();
        employee.setAge(10);
        employee.setName("aska");
        emplyeeDaoProxy.delete(employee);

    }
}
