package com.wulala.bgconsole.service.impl;

import com.wulala.bgconsole.entity.Developer;
import com.wulala.bgconsole.mapper.DeveloperMapper;
import com.wulala.bgconsole.service.DeveloperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Resource
    DeveloperMapper developerMapper;

    @Override
    public List<Developer> listAll() {
        return developerMapper.listAll();
    }

    @Override
    public int addDeveloper(Developer developer) {
        return developerMapper.addDeveloper(developer);
    }

    @Override
    public int updateDeveloper(Developer developer){
        return developerMapper.updateDeveloper(developer);
    }

    @Override
    public int removeDeveloper(Developer developer){
        return developerMapper.removeDeveloper(developer);
    }

}
