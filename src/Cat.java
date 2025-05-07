class Cat {
    // Attributes
    private String name;
    private int age;
    private String breed;
    private int weight;

    // Constructor
    public Cat(String name, int age, String breed, int weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    // Methods
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
    public void setWeight(int weight){
        System.out.println("The cat's weight is " + weight + ".");
    }

    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight);
    }
}