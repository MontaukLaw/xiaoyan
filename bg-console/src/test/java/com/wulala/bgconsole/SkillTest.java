package com.wulala.bgconsole;

import com.wulala.bgconsole.service.SkillService;
import com.wulala.bgconsole.service.impl.SkillServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SkillTest {

    @Autowired
    SkillServiceImpl skillService;

    @Test
    public void testListAll() {
        System.out.println(skillService.listAll());
    }

    @Test
    public void testGetAllSkillName(){
        System.out.println(skillService.getAllSkillName());
    }
}
