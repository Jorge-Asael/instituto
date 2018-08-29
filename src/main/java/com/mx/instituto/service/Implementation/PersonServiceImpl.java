package com.mx.instituto.service.Implementation;

import com.mx.instituto.entity.Person;
import com.mx.instituto.repository.PersonRepository;
import com.mx.instituto.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PersonInterfaceImpl")
public class PersonServiceImpl implements PersonService {

    @Autowired
    @Qualifier("personRepository")
    PersonRepository personRepository;

    public Person addPerson(Person person) {
        return personRepository.saveAndFlush(person);
    }

    @Override
    public List<Person> listAllPersons() {
        List<Person> persons = personRepository.findAll();
        return persons; }
}
