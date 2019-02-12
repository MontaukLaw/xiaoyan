package com.wulala.bgconsole.service.impl;

import com.wulala.bgconsole.entity.Developer;
import com.wulala.bgconsole.entity.Skill;
import com.wulala.bgconsole.entity.SkillExample;
import com.wulala.bgconsole.mapper.SkillMapper;
import com.wulala.bgconsole.service.SkillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Resource
    SkillMapper skillMapper;

    @Override
    public List<Skill> listAll() {

        return skillMapper.listAll();
    }

    @Override
    public List<Skill> getAllSkillName(){
        return skillMapper.getAllSkillName();
    }

}
