package com.aasha.repository;

import com.aasha.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PersonRepository extends MongoRepository<Person, Long> {
    List<Person> findByName(String name);
}
