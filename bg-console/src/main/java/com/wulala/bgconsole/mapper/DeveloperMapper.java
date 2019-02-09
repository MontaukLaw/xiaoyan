package com.wulala.bgconsole.mapper;

import com.wulala.bgconsole.domain.model.Developer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeveloperMapper {
    List<Developer> listAll();
}
