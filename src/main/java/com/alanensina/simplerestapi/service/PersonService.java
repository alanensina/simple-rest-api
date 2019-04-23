package com.alanensina.simplerestapi.service;

import java.util.List;

import com.alanensina.simplerestapi.model.Person;

public interface PersonService {

	Person create(final Person person);
    Person findById(final String personId);
    List<Person> findAll();
    Person update(Person person);
    void delete(final String personId);
    
}
