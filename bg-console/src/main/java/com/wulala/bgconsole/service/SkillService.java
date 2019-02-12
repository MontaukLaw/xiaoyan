package com.wulala.bgconsole.service;

import com.wulala.bgconsole.entity.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkillService {
    List<Skill> listAll();

    List<Skill> getAllSkillName();

}
