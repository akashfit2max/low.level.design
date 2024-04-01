package com.akash.low.level.design.designpatterns.Structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(Employee employee) {
        System.out.println("cretated new employee");
    }

    @Override
    public void delete(Employee employee) {
        System.out.println("deleted");
    }
}
