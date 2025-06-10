package org.example;

class Person {
    String name;
    int age;

    public Person(String inputName, int inputAge) {
        name = inputName;
        age = inputAge;

    }

    void hello() {
        System.out.println("hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person =new Person("h662", 18);



        person.hello();
    }
}