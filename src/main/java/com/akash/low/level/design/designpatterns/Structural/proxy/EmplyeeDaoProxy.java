package com.akash.low.level.design.designpatterns.Structural.proxy;

public class EmplyeeDaoProxy implements EmployeeDao {

    private EmployeeDaoImpl employeeDao;

    public EmplyeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(Employee employee) {
        if (employee.getAge() > 10) {
            employeeDao.create(employee);
        } else {
            System.out.println("wrong");
        }
    }

    @Override
    public void delete(Employee employee) {
        if (employee.getAge() < 15) {
            System.out.println("cant delete");
        } else {
            employeeDao.delete(employee);
        }
    }
}
