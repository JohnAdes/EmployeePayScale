package com.johnson;

public class Employee {

    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long phone;
    double basicSalary;
    private double specialAllowance = 250.80;
    private double Hra = 1000.50;

    public Employee() {
    }

    public Employee(long employeeId, String employeeName, String employeeAddress, long phone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.phone = phone;
    }

    public void calculateSalary() {
        double salary = basicSalary + (basicSalary* (specialAllowance/100)) + (basicSalary * (Hra/100));
        System.out.println(salary);
    }


    /**
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void calculateTransportAllowance() {
        double transportAllowance = 0.10 * basicSalary;
        System.out.println(transportAllowance);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public void setSpecialAllowance(double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    public double getHra() {
        return Hra;
    }

    public void setHra(double hra) {
        Hra = hra;
    }
}
