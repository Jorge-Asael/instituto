package com.mx.instituto.service;

import com.mx.instituto.entity.Person;

import java.util.List;

public interface PersonService {

    public abstract Person addPerson(Person p);

    public abstract List<Person> listAllPersons();
}
