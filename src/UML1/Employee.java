package UML1;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(Employee e) {
        this.name = e.name;
        this.id = e.id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public double calculatePay() {
        return 0.0; // This will be overridden in subclasses
    }
}
