class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
    void update(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
        System.out.println(name + " is now " + age + " years old.");
    }
    public static void main(String[] args) {
        System.out.println("Q1:");
        Person p1 = new Person("Ean Craig", 11);
        Person p2 = new Person("Evan Ross", 12);
        p1.display();
        p2.display();
        System.out.println("Set new age and name:");
        p1.update("Ean Craig", 14);
        p2.update("Lewis Jordan", 12);
    }
}
