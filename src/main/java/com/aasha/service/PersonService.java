package com.aasha.service;

import com.aasha.model.Person;
import com.aasha.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByName(String name) {
        return personRepository.findByName(name);
    }

    public Person storePerson(Person person) {
        person.setId(UUID.randomUUID());
        return personRepository.save(person);
    }

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }
}
