package ru.gb.savilin.Builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().setFirstName("Sava").setLastName("Valkonsky").build();
        System.out.println(person.getLastName());
    }
}
