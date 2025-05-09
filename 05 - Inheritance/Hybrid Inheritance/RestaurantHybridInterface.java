interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Cooking meals and preparing dishes.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Taking orders and serving food to customers.");
    }
}

public class RestaurantHybridInterface {
    public static void main(String[] args) {
        Chef chef = new Chef("Abc", 101);
        Waiter waiter = new Waiter("Xyz", 102);

        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}