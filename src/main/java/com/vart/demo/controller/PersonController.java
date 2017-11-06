package com.vart.demo.controller;

import com.vart.demo.dao.PersonDao;
import com.vart.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vart.demo.dao.PersonDao;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/person/create")
    public String create(String name) {
        Long personId = null;
        try {
            Person person = new Person(name);
            Person newPerson = personDao.save(person);
            personId = newPerson.id;
        } catch (Exception e) {
            e.printStackTrace();
            return "can not create person with name " + name;
        }
        return "Person successfully created with id " + personId;
    }

    @RequestMapping("/person")
    public String index() {
        return "ok";
    }

    @RequestMapping("/person/test")
    public String test() {
        try {
            Person person = new Person("test");
            Person newPerson = personDao.save(person);
        } catch (Exception e) {
            e.printStackTrace();
            return "not ok";
        }
        return "ok";
    }
}
