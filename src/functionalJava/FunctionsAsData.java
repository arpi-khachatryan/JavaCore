package functionalJava;

public class FunctionsAsData {

    protected static class Person {

        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {

        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment ?
                    this::loadPersonReal :
                    this::loadPersonFake;
        }

        private Person loadPersonReal() {
            System.out.println("Loading person...");
            return new Person("Real person object", 55);
        }

        private Person loadPersonFake() {
            System.out.println("Returning fake person object...");
            return new Person("Fake person", 45);
        }
    }

    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = true;
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
