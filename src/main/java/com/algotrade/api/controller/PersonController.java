package com.algotrade.api.controller;

import com.algotrade.api.model.Person;
import com.algotrade.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository repository;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        repository.save(person);
    }
}
