package com.wulala.bgconsole.mapper;

import com.wulala.bgconsole.entity.Skill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillMapper {
    List<Skill> listAll();

    List<Skill> getAllSkillName();
}
