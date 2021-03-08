public class Test {

    public static void main(String args[]) {

        Person person = new Person("R. Johnson");

        System.out.println(Person.getNextId()); // (1)
    }
}

class Person {

    private static long nextId = 1;

    long id;
    String name;

    public Person(String name) {
       name = name; // (2)
        this.id = nextId;
        this.nextId++; // (3)
    }

    public static getNextId() { // (4)
        return nextId;
    }
}