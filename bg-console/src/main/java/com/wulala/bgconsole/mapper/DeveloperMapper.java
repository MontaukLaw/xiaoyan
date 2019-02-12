package com.wulala.bgconsole.mapper;

import com.wulala.bgconsole.entity.Developer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeveloperMapper {

    List<Developer> listAll();

    int addDeveloper(Developer developer);

    int updateDeveloper(Developer developer);

    int removeDeveloper(Developer developer);
}
