package com.wulala.bgconsole.controller;

import com.wulala.bgconsole.entity.Skill;
import com.wulala.bgconsole.entity.SkillExample;
import com.wulala.bgconsole.service.impl.SkillExamplerServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bg")
public class ExampleController {

    @Resource
    SkillExamplerServiceImpl skillExamplerService;

    @RequestMapping(value = "/skills/{id}/skillexamples/", method = RequestMethod.GET)
    public List<SkillExample> getSkillExampleBySkillId(@PathVariable String id) {
        Skill skill = new Skill();
        skill.setId(id);
        List<SkillExample> examples = skillExamplerService.getExamplesOfSkill(skill);
        return examples;
    }

    @RequestMapping(value = "/skillexamples/", method = RequestMethod.POST)
    public int addSkillExample(SkillExample skillExample) {
        int result = skillExamplerService.addExample(skillExample);
        return result;
    }

    @RequestMapping(value = "/skillexamples/{id}", method = RequestMethod.PUT)
    public int updateSkillExample(@PathVariable String id,
                                  SkillExample skillExample) {
        int result = skillExamplerService.updateExample(skillExample);
        return result;
    }

    @RequestMapping(value = "/skillexamples/{id}", method = RequestMethod.DELETE)
    public int removeSkillExample(@PathVariable String id) {
        SkillExample skillExample = new SkillExample();
        skillExample.setId(id);
        int result = skillExamplerService.removeExample(skillExample);
        return result;
    }


}
