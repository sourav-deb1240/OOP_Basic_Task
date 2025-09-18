class Employee {
    String name;
    String jobTitle;
    double salary;
    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
    void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        System.out.println("Q6:\n");
        Employee e1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee e2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
        System.out.println("Employee Details:");
        e1.display();
        e2.display();
        System.out.println("\nAfter raising salary:\n");
        System.out.println("8% for 'Franziska Waltraud':");
        e1.raiseSalary(8);
        e1.display();
        System.out.println("\n12% for 'Hubertus Andrea':");
        e2.raiseSalary(12);
        e2.display();
    }
}
