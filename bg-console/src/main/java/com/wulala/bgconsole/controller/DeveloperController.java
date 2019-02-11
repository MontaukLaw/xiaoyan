package com.wulala.bgconsole.controller;

import com.wulala.bgconsole.domain.model.Developer;
import com.wulala.bgconsole.service.impl.DeveloperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bg")
public class DeveloperController {

    @Autowired
    DeveloperServiceImpl developerService;

    @RequestMapping(value="/developers/",method = RequestMethod.GET)
    public List<Developer> getAllDevelopersWithPagination(){
        List<Developer> developers=developerService.listAll();
        return developers;
    }

    @RequestMapping(value="/developers/",method = RequestMethod.POST)
    public int addDeveloper(Developer developer){
        //Developer developer=new Developer();
        //developer.setNAME(name);
        //developer.setTYPE(type);
        int result=developerService.addDeveloper(developer);
        return result;

    }

}
