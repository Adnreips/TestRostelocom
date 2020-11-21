package com.example.rostelecom.entity;

import lombok.Data;
import javax.persistence.*;

/**
 * Person
 *
 * @author "Andrei Prokofiev"
 */

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Sex sex;

    public enum Sex{
        Male, Female
    }


}
