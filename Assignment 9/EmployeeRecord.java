/**
 * Employee Record System
Create a class Employee with private fields: id, name, and salary.
Use setter methods to assign values. Add a method to display employee details.
 */

class EmployeeRecord {
   
    private int id;
    private String name;
    private int salary;

  
    public void setEmpDetails(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary: " + salary);
    }
}


class Main {
    public static void main(String[] args) {
        EmployeeRecord emp = new EmployeeRecord();

       
        emp.setId(202);
        emp.setName("John Doe");
        emp.setSalary(50000);

        emp.displayDetails();
    }
}
