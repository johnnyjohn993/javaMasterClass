class Example {
    private int value;
    private String name;

    // First constructor
    public Example(int value) {
        this(value, "Default Name"); // Calls the second constructor
    }

    // Second constructor
    public Example(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public void display() {
        System.out.println("Value: " + value + ", Name: " + name);
    }

    public static void main(String[] args) {
        Example example1 = new Example(10);
        example1.display(); // Output: Value: 10, Name: Default Name

        Example example2 = new Example(20, "Custom Name");
        example2.display(); // Output: Value: 20, Name: Custom Name
    }
}
