package com.example.rostelecom.controllers;

import com.example.rostelecom.entity.Person;
import com.example.rostelecom.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;*/

/**
 * PersonController
 *
 * @author "Andrei Prokofiev"
 */

@RestController
public class PersonController {

    Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonRepository personRepository;

    @PostMapping(value = "/json", consumes = "application/json")
    public void getJson(@RequestBody Person person) {

        if (person != null){
            personRepository.save(person);
            logger.info("Объект сохранен в базе");
        }
    }


}
