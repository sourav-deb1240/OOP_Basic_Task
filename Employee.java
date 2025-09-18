import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("HireDate: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
        System.out.println();
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Roberta Petrus", 50000.0, LocalDate.of(2021, 4, 1));
        Employee e2 = new Employee("Loyd Blair", 70000.0, LocalDate.of(2015, 4, 1));
        Employee e3 = new Employee("Magdalena Artemon", 50000.0, LocalDate.of(2011, 1, 15));

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }

}
