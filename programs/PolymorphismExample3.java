class Employee {
    void calculateSalary() {
        System.out.println("Generic Employee Salary");
    }
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager Salary: Rs:5000");
    }
}

class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Developer Salary: Rs:4000");
    }
}

public class PolymorphismExample3 {
    public static void main(String[] args) {
        Employee emp;

        emp = new Manager();
        emp.calculateSalary();

        emp = new Developer();
        emp.calculateSalary();
    }
}
