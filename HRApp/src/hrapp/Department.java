/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author rahulmaheshwari
 */
public class Department {

    private String name;
    private Employee[] emps = new Employee[10];
    private int employeeAdded = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmp(Employee newEmployee) {
        if (employeeAdded < emps.length) {
            employeeAdded++;
            emps[employeeAdded] = newEmployee;
        }
    }

    public Employee[] getEmployees() {
        Employee[] newEmps = new Employee[employeeAdded + 1];
        for (int i = 0; i < employeeAdded + 1; i++) {
            newEmps[i] = emps[i];
        }
        return newEmps;
    }

    public int getEmployeeCount() {
        return employeeAdded + 1;
    }

    public Employee getEmployeeById(int id) {
        for (Employee emp : emps) {
            if (emp != null) {
                if (emp.getId() == id) {
                    return emp;
                }
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < employeeAdded + 1; i++) {
            totalSalary += emps[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (employeeAdded > -1) {
            return getTotalSalary() / (employeeAdded + 1);
        }
        return 0.0;
    }

}
