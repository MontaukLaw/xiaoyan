package com.wulala.bgconsole.mapper;

import com.wulala.bgconsole.entity.Skill;
import com.wulala.bgconsole.entity.SkillExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillExampleMapper {
    List<SkillExample> getExamplesOfSkill(Skill skill);

    int addExample(SkillExample skillExample);

    int removeExample(SkillExample skillExample);

    int updateExample(SkillExample skillExample);

}
