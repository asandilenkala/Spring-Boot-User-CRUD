package com.example.user.model;

import jakarta.persistence.*;

@Entity
@Table(name="user_data")

public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private long id;
    private String name;
    private String surname;
    private String email;
    private int age;

    // Generate a Constructor.
    public User(String name,
                String surname,
                String email,
                int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    public User() {

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String toString(){
        return "User{" +
                "Name:" + name + "\n" +
                "Surname:" + surname + "\n" +
                "Email:" + email + "\n" +
                "Age:" + age + "\n" +
                "}";
    }
}

