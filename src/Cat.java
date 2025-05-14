class Cat {
    // Attributes
    private String name;
    private int age;
    private String breed;
    private String personality;
    private String gender;

    // Constructor
    public Cat(String name, int age, String breed,String personality, String gender) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.personality = personality;
        this.gender = gender;

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
        System.out.println("Breeds: " + breed);
        System.out.println("Personality: " + personality);
        System.out.println("Gender: " + gender);

    }
}