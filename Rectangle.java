class Rectangle {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double area() {
        return width * height;
    }
    double perimeter() {
        return 2 * (width + height);
    }
    public static void main(String[] args) {
        System.out.println("Q3:");
        Rectangle rect = new Rectangle(12, 7);
        System.out.println("The area of the rectangle is " + rect.area());
        System.out.println("The perimeter of the rectangle is " + rect.perimeter());
        System.out.println();
        rect = new Rectangle(9, 8);
        System.out.println("The area of the rectangle is now " + rect.area());
        System.out.println("The perimeter of the rectangle is now " + rect.perimeter());
    }
}
