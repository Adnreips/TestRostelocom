package com.example.rostelecom.repositories;

import com.example.rostelecom.entity.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * PersonRepository
 *
 * @author "Andrei Prokofiev"
 */

public interface PersonRepository extends CrudRepository<Person, String> {
}
