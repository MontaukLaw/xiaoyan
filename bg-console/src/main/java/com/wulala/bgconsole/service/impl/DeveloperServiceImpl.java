package com.wulala.bgconsole.service.impl;

import com.wulala.bgconsole.domain.model.Developer;
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

}