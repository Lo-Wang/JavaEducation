package lr2;

public class example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Labrador");
        Cat cat = new Cat("Winston", 5, "Dry food");
        Bird bird = new Bird("Sparrow", 2, true);

        dog.makeSound();
        dog.wagTail();

        cat.makeSound();
        cat.meow();

        bird.makeSound();
        bird.fly();
    }
    
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("woof-woof");
    }

    public void wagTail() {
        System.out.println("Dog is wagging tail");
    }
}

class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void meow() {
        System.out.println("Cat is meowing");
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }


    @Override
    public void makeSound() {
        System.out.println("chirp-chirp");
    }
    public void fly() {
        if (canFly) {
            System.out.println("Bird is flying");
        } else {
            System.out.println("This bird cannot fly");
        }
    }
}

