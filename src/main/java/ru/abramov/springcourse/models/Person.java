package ru.abramov.springcourse.models;

public class Person {

    private int id;

    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person() {}

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
