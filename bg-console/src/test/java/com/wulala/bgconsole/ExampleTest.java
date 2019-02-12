package com.wulala.bgconsole;

import com.wulala.bgconsole.entity.Skill;
import com.wulala.bgconsole.entity.SkillExample;
import com.wulala.bgconsole.service.impl.SkillExamplerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {

    @Resource
    SkillExamplerServiceImpl skillExamplerService;

    @Test
    public void testGetExamplesOfSkill() {
        Skill skill = new Skill();
        skill.setId("2");
        System.out.println(skillExamplerService.getExamplesOfSkill(skill));
    }

    @Test
    public void testAddExample(){
        SkillExample skillExample=new SkillExample();
        skillExample.setExample("晓言晓言, 今天气温");
        skillExample.setSkillId("2");
        System.out.println(skillExamplerService.addExample(skillExample));
    }

    @Test
    public void testRemoveExample(){
        SkillExample skillExample=new SkillExample();
        skillExample.setId("4");
        System.out.println(skillExamplerService.removeExample(skillExample));
    }

    @Test
    public void testUpdateExample(){
        Skill skill = new Skill();
        skill.setId("1");
        SkillExample skillExample=new SkillExample();
        skillExample.setId("40a4c7b5-2ea7-11e9-9fad-525400820e38");
        skillExample.setSkillId("2");
        System.out.println(skillExamplerService.updateExample(skillExample));
        System.out.println(skillExamplerService.getExamplesOfSkill(skill));
        skillExample.setExample("晓言晓言, 现在冷么");
        System.out.println(skillExamplerService.updateExample(skillExample));
        System.out.println(skillExamplerService.getExamplesOfSkill(skill));
    }
}
