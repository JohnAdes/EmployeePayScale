package com.johnson;

public class Manager extends Employee{

    public Manager() {
    }

    public Manager(long employeeId, String employeeName, String employeeAddress, long phone, double basicSalary) {
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 0.15 * basicSalary;
        System.out.println(transportAllowance);
    }
}
