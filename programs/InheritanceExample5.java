class Employee {
    String name;
    int ID;

    Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", ID: " + ID);
    }
}

class PermanentEmployee extends Employee {
    PermanentEmployee(String name, int ID) {
        super(name, ID);
    }

    void benefits() {
        System.out.println("Permanent Employee Benefits");
    }
}

public class InheritanceExample5 {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee("Bob", 202);
        emp.display();
        emp.benefits();
    }
}
