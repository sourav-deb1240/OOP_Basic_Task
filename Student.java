import java.util.ArrayList;
class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    public void addCourse(String course) {
        courses.add(course);
    }
    public void removeCourse(String course) {
        courses.remove(course);
    }
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
    public void displayCourses() {
        System.out.println(name + "'s courses: " + courses);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Carolus Vitali", 11);
        Student s2 = new Student("Nakeisha Uhuru", 10);
        Student s3 = new Student("Gabriella Cherice", 10);
        System.out.println("Student Details:");
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
        System.out.println("\nAdding courses for Carolus Vitali");
        s1.addCourse("Math");
        s1.addCourse("Science");
        s1.addCourse("English");
        s1.displayCourses();
        System.out.println("\nAdding courses for Nakeisha Uhuru");
        s2.addCourse("History");
        s2.addCourse("Geography");
        s2.addCourse("English");
        s2.displayCourses();
        System.out.println("\nRemoving 'Science' course for Carolus Vitali");
        s1.removeCourse("Science");
        s1.displayCourses();
    }
}
