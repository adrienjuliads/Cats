class Cat {
    // Attributes
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Methods
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
    }
}