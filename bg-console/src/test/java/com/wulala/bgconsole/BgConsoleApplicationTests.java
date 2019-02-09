package com.wulala.bgconsole;

import com.wulala.bgconsole.domain.model.Developer;
import com.wulala.bgconsole.mapper.DeveloperMapper;
import com.wulala.bgconsole.service.DeveloperService;
import com.wulala.bgconsole.service.impl.DeveloperServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
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
        logger.debug("result is " + developers.toString());
    }

}

