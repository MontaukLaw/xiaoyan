package com.wulala.bgconsole.service.impl;

import com.wulala.bgconsole.entity.Skill;
import com.wulala.bgconsole.entity.SkillExample;
import com.wulala.bgconsole.mapper.SkillExampleMapper;
import com.wulala.bgconsole.service.SkillExampleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SkillExamplerServiceImpl implements SkillExampleService {

    @Resource
    SkillExampleMapper skillExampleMapper;

    @Override
    public List<SkillExample> getExamplesOfSkill(Skill skill) {
        return skillExampleMapper.getExamplesOfSkill(skill);
    }

    @Override
    public int addExample(SkillExample skillExample) {
        int result = skillExampleMapper.addExample(skillExample);
        return result;
    }

    @Override
    public int removeExample(SkillExample skillExample) {
        int result = skillExampleMapper.removeExample(skillExample);
        return result;
    }

    @Override
    public int updateExample(SkillExample skillExample) {
        int result = skillExampleMapper.updateExample(skillExample);
        return result;
    }

}
