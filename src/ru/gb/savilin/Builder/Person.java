package ru.gb.savilin.Builder;

public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public static class Builder{
        private Person person;

        public Builder(){
            person = new Person();
        }

        public Builder setFirstName(String firstName){
            person.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            person.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName){
            person.middleName = middleName;
            return this;
        }

        public Builder setCountry(String country){
            person.country = country;
            return this;
        }

        public Builder setAddress(String address){
            person.address = address;
            return this;
        }

        public Builder setPhone(String phone){
            person.phone = phone;
            return this;
        }

        public Builder setAge(int age){
            person.age = age;
            return this;
        }

        public Builder setGender(String gender){
            person.gender = gender;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
