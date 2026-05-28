class Animal {

    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OOPConceptsDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}