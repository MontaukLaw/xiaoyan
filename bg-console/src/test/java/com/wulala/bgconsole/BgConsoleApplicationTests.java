package com.wulala.bgconsole;

import com.alibaba.fastjson.JSON;
import com.wulala.bgconsole.entity.Developer;
import com.wulala.bgconsole.service.impl.DeveloperServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BgConsoleApplicationTests {
    Logger logger = LoggerFactory.getLogger(BgConsoleApplicationTests.class);

    @Autowired
    DeveloperServiceImpl developerService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testListAll() {
        List<Developer> developers = developerService.listAll();

        //List<Developer> developers = developerMapper.listAll();
        logger.debug("result is " + JSON.toJSONString(developers.toString()));
    }

    @Test
    public void testAddDev() {
        for (int i = 0; i < 10; i++) {
            Developer developer = new Developer();
            developer.setName("tester" + i);
            developer.setType(i % 2 + 1);
            int result = developerService.addDeveloper(developer);
            System.out.println(result);
        }
    }

    @Test
    public void testPatchDeveloper() {
        Developer developer = new Developer();
        developer.setId("332ddbee-2e10-11e9-9fad-525400820e38");
        developer.setName("patched");
        System.out.println(developer);
        //developer.setType(1);
        int result = developerService.updateDeveloper(developer);
        System.out.println(result);
    }

    @Test
    public void testDeleteDev() {
        Developer developer = new Developer();
        developer.setId("c511e22e-2c86-11e9-9fad-525400820e38");
        int result = developerService.removeDeveloper(developer);
        logger.debug("" + result);
    }

}

