package some.polimorphism;

public class Animal {
    public void voice() {
        System.out.println("Голос");
    }
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.voice();
        dog.voice();
    }
}
