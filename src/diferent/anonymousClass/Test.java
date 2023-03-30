package diferent.anonymousClass;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

//class Dog extends Animal{
//    @Override
//    public void eat(){
//        System.out.println("Dog is eating");
//    }
//}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
//        Dog dog=new Dog();
//        dog.eat();

        Animal animal2 = new Animal() { //Dog//Subclass
            public void eat() {
                System.out.println("Dog is eating");
            }
        };
        animal2.eat();
    }
}
