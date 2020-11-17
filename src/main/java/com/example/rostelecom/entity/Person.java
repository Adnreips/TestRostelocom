package com.example.rostelecom.entity;

import javax.persistence.*;

/**
 * Person
 *
 * @author "Andrei Prokofiev"
 */


@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

//    @Id
    private String name;
    private String surname;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Sex sex;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String sername) {
        this.surname = sername;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
