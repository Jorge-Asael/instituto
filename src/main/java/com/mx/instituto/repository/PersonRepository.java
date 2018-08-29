package com.mx.instituto.repository;

import com.mx.instituto.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface PersonRepository extends JpaRepository<Person, Serializable> {

}
