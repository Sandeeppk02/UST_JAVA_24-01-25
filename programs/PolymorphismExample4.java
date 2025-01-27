class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Meows");
    }
}

public class PolymorphismExample4 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
