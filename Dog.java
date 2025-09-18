class Dog {
    private String name;
    private String breed;
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void display() {
        System.out.println(name + " is a " + breed + ".");
    }
    void setBreed(String breed) {
        this.breed = breed;
        System.out.println(name + " is now " + breed + ".");
    }
    void setName(String name) {
        this.name = name;
        System.out.println(name + " is now a " + breed + ".");
    }
    public static void main(String[] args) {
        System.out.println("Q2:");
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");
        dog1.display();
        dog2.display();
        System.out.println("Set the new Breed of dog1 and new name of dog2:");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");
    }
}
