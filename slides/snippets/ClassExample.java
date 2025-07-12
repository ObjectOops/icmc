public class Main {
    public static void main(String[] args) {
        // We can still use arrays to store multiple people, but here we only need one array.
        Person[] people = {
            // Use the `new` keyward when creating objects from the Person class.
            new Person("Alice", 20, "Shanghai", "Aly"), // This a person object.
            new Person("Bob", 21, "New York", "B"), // Another person object.
            new Person("Charlie", 25, "London", "Chip") // ...
        };
        
        // Get a person.
        Person person = people[0]; // `person` is an object instantiated from `Person`.
        Person samePerson = people[0];
        
        person.sayHi();
        samePerson.sayHi();
        
        // Both `person` and `samePerson` refer to the same object of `Person`.
        // Changing one variabe's attributes will also be reflected by the other variable!
        person.city = "Wonderland";
        samePerson.sayHi();
        // This is why they classes are "reference types".
        
        // We can access static attributes and static methods directly from a class without needing an object.
        System.out.println(Person.NUMBER); // Access `NUMBER` directly from `Person`.
        Person.someStaticMethod(); // Call `someStaticMethod` directly from `Person`.
        
        // You can treat the keyword `null` as meaning "no data specified yet".
        Person temporaryPerson = null;
        // The object can be properly initialized later.
        // temporaryPerson = new Person("Echo", 1000, "Atlantis", "E");
        // Calling methods on an object with value `null` will cause a runtime error!
        // temporaryPerson.sayHi();
        
        // Attempting to access private members will result in an error!
        // String fail = person.nickname;
        // person.sayNickname();
    }
}

// The Person class.
class Person {
    // A static attribute.
    public static final int NUMBER = 10;
    
    // Attributes:
    public String name;
    public int age;
    public String city;
    
    // A private attribute.
    private String nickname;
    
    // A constructor. Special method that does not require specifying a return type.
    public Person(String name, int age, String city, String nick) {
        // We use the `this` keyboard to distinguish between the `name` argument and the `name` attribute.
        this.name = name;
        this.age = age;
        this.city = city;
        // `this` is not required for the `nickname` attribute because the argument is called `nick`.
        nickname = nick;
    }
    
    // A method, just like a function.
    public void sayHi() {
        System.out.println("Hi, my name is " + name + ". I'm " + age + " years old and I live in " + city + ".");
    }
    
    // A private method.
    private void sayNickname() {
        System.out.println("My nickname is " + nickname + ".");
    }
    
    // A static method.
    public static void someStaticMethod() {
        System.out.println("Did something.");
    }
}
