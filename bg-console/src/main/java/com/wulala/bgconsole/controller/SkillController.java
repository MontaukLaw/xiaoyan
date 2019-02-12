package com.wulala.bgconsole.controller;

import com.wulala.bgconsole.entity.Skill;
import com.wulala.bgconsole.service.SkillService;
import com.wulala.bgconsole.service.impl.SkillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/bg")
public class SkillController {

    @Autowired
    SkillServiceImpl skillServiceImpl;

    @RequestMapping(value = "/skillsname/", method = RequestMethod.GET)
    public List<Skill> getSkillsShort() {
        return skillServiceImpl.getAllSkillName();
    }

    @RequestMapping(value = "/skills/", method = RequestMethod.GET)
    public List<Skill> getAllSkills() {
        return skillServiceImpl.listAll();
    }

}
