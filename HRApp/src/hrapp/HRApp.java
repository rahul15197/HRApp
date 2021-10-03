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
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to HRApp");
        Employee e1 = new Employee(123, "Rahul", 12000);
        Employee e2 = new Employee(124, "Divya", 10000);
        Department dept = new Department("Education");
        dept.addEmp(e1);
        dept.addEmp(e2);
        Employee[] emps = dept.getEmployees();
        for(Employee e:emps){
            System.out.println("Employee -> " + e);
        }
        System.out.println("Total Salary = " + dept.getTotalSalary());
        System.out.println("Average Salary = " + dept.getAverageSalary());
        System.out.println("Department Employee -> " + dept.getEmployeeById(125));

        
    }
    
}
