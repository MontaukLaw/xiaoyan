package com.wulala.bgconsole.service;

import com.wulala.bgconsole.entity.Developer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeveloperService {

    List<Developer> listAll();

    int addDeveloper(Developer developer);

    int updateDeveloper(Developer developer);

    int removeDeveloper(Developer developer);

}
