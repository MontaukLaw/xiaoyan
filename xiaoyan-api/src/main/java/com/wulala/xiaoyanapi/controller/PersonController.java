package com.wulala.xiaoyanapi.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.wulala.xiaoyanapi.domain.model.Person;
import com.wulala.xiaoyanapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest() {
        return "test";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public PageInfo<Person> getAllWithPagination() {
        Page<Person> persons = personService.findByPage(1, 5);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
        PageInfo<Person> pageInfo = new PageInfo<>(persons);
        return pageInfo;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Person getByPersonID(@PathVariable Long id) {
        Person person = personService.findByPersonID(id);
        return person;
    }
}
