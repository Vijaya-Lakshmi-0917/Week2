class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " Sounds Woof");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " Sounds Meow");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " Sounds Tweet");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Animal dog = new Dog("MyDog", 3);
        Animal cat = new Cat("MyCat", 2);
        Animal bird = new Bird("MyBird", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}