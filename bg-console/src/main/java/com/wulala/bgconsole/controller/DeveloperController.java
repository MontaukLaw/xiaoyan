package com.wulala.bgconsole.controller;

import com.wulala.bgconsole.domain.model.Developer;
import com.wulala.bgconsole.service.impl.DeveloperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bg")
public class DeveloperController {

    @Autowired
    DeveloperServiceImpl developerService;

    @RequestMapping(value = "/developers/", method = RequestMethod.GET)
    public List<Developer> getAllDevelopersWithPagination() {
        List<Developer> developers = developerService.listAll();
        return developers;
    }

    @RequestMapping(value = "/developers/", method = RequestMethod.POST)
    public int addDeveloper(Developer developer) {
        //Developer developer=new Developer();
        //developer.setNAME(name);
        //developer.setTYPE(type);
        int result = developerService.addDeveloper(developer);
        return result;
    }

    @RequestMapping(value = "/developers/{id}", method = RequestMethod.DELETE)
    public int deleteDeveloper(@PathVariable String id) {
        Developer developer = new Developer();
        developer.setId(id);
        int result = developerService.removeDeveloper(developer);
        return result;
    }

    @RequestMapping(value = "/developers/{id}", method = RequestMethod.PUT)
    public int patchDeveloper(@PathVariable String id,
                              Developer developer
                              //@RequestBody int type
    ) {
        //Developer developer = new Developer();
        //System.out.println("name is " + developer.getName() + " type is " + developer.getType());
        developer.setId(id);
        int result = developerService.updateDeveloper(developer);
        return result;
    }

}
