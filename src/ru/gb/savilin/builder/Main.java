package ru.gb.savilin.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().addFirstName("sava").addLastName("valkonsky").build();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
}
