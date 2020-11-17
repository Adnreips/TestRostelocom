package com.example.rostelecom.controllers;

import com.example.rostelecom.entity.Person;
import com.example.rostelecom.repositories.PersonRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

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

    @RequestMapping("json")
    public void json() {
        URL url = this.getClass().getClassLoader().getResource("persons.json");
        if (url != null) {
            List<Person> people = null;
            try {
                File jsonFile = new File(url.toURI());
                ObjectMapper objectMapper = new ObjectMapper();

                people = objectMapper.readValue(jsonFile, new TypeReference<List<Person>>() {
                });
                personRepository.saveAll(people);
                logger.info("All records saved.");
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }

        } else {
            logger.warn("url in null");
        }


    }


}
