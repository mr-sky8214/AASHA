package com.aasha.controller;

import com.aasha.model.Person;
import com.aasha.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping("/{name}")
    public List<Person> getPeopleByName(@PathVariable String name) {
        return personService.getPersonsByName(name);
    }

    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return personService.storePerson(person);
    }
}
