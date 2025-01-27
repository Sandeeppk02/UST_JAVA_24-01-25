class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Exam extends Student {
    double marks1, marks2, marks3;

    Exam(String name, int rollNumber, double marks1, double marks2, double marks3) {
        super(name, rollNumber);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3;
    }
}

public class InheritanceExample4 {
    public static void main(String[] args) {
        Exam student = new Exam("Alice", 101, 85, 90, 88);
        System.out.println("Average Marks: " + student.calculateAverage());
    }
}
