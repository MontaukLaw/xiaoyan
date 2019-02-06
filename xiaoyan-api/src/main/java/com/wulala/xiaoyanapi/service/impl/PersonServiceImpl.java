package com.wulala.xiaoyanapi.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wulala.xiaoyanapi.domain.mapper.PersonMapper;
import com.wulala.xiaoyanapi.domain.model.Person;
import com.wulala.xiaoyanapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {

    //@Autowired
    @Resource
    private PersonMapper personMapper;

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }

    @Override
    public Page<Person> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return personMapper.findByPage();
    }

    @Override
    @Transactional
    public void insert(Person person) {
        personMapper.insert(person);
    }

    @Override
    public Person findByPersonID(Long id) {
        Person person = personMapper.selectByPrimaryKey(id);
        return person;
    }

}
