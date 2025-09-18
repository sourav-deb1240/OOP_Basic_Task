public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        System.out.println("Q4:");
        Circle c1 = new Circle(5);
        System.out.println("Radius of the circle is " + c1.getRadius());
        System.out.println("The area of the circle is " + c1.area());
        System.out.println("The circumference of the circle is " + c1.circumference());
        System.out.println();
        c1.setRadius(8);
        System.out.println("Radius of the circle is " + c1.getRadius());
        System.out.println("The area of the circle is now " + c1.area());
        System.out.println("The circumference of the circle is now " + c1.circumference());
    }
}