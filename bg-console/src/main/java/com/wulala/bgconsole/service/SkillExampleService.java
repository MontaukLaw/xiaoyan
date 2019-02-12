package com.wulala.bgconsole.service;

import com.wulala.bgconsole.entity.Skill;
import com.wulala.bgconsole.entity.SkillExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkillExampleService {

    List<SkillExample> getExamplesOfSkill(Skill skill);

    int addExample(SkillExample skillExample);

    int removeExample(SkillExample skillExample);

    int updateExample(SkillExample skillExample);
}
