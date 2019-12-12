package com.johnson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee ID");
        long employeeId = in.nextLong();
        System.out.println("Enter employee Name");
        String employeeName = in.next();
        System.out.println("Enter employee Address");
        String employeeAddress = in.next();
        System.out.println("Enter employee Phone number");
        long phone = in.nextLong();
        System.out.println("Enter Basic Salary");
        double basicSalary = in.nextDouble();

        Manager mgr = new Manager(employeeId, employeeName, employeeAddress, phone, basicSalary);
        System.out.print("the Manager's Salary is $ ");
        mgr.calculateSalary();
        System.out.print("the Manager's Transport Allowance is $ ");
        mgr.calculateTransportAllowance();

        Trainee trn = new Trainee(employeeId, employeeName, employeeAddress, phone, basicSalary);
        System.out.print("the Trainee Salary is  $ ");
        trn.calculateSalary();
        System.out.print("the Trainee Transport Allowance is $ ");
        trn.calculateTransportAllowance();
    }
}
