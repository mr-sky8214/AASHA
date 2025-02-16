package com.aasha.service;

import com.aasha.model.Person;
import com.aasha.repository.PersonRepository;
import com.aasha.service.database.DatabaseSequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final DatabaseSequenceGeneratorService databaseSequenceGeneratorService;

    @Autowired
    public PersonService(PersonRepository personRepository, DatabaseSequenceGeneratorService databaseSequenceGeneratorService) {
        this.personRepository = personRepository;
        this.databaseSequenceGeneratorService = databaseSequenceGeneratorService;
    }

    public List<Person> getPersonsByName(String name) {
        return personRepository.findByName(name);
    }

    public Person storePerson(Person person) {
        person.setId(databaseSequenceGeneratorService.generateSequence(Person.SEQUENCE_NAME));
        return personRepository.save(person);
    }

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }
}
