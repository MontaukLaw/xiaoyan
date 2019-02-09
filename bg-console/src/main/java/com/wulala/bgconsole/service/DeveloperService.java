package com.wulala.bgconsole.service;

import com.wulala.bgconsole.domain.model.Developer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeveloperService {

    List<Developer> listAll();
}
