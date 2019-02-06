package com.wulala.xiaoyanapi;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.wulala.xiaoyanapi.domain.model.Person;
import com.wulala.xiaoyanapi.page.PageInfo;
import com.wulala.xiaoyanapi.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XiaoyanApiApplicationTests {

    private Logger logger = LoggerFactory.getLogger(XiaoyanApiApplicationTests.class);

    @Resource
    private PersonService personService;

    @Test
    public void testInsert() {
        for (int i = 1; i < 100; i++) {
            Person person = new Person();
            person.setName("测试" + i);
            person.setAddress("address" + i);
            person.setAge(10 + i);
            personService.insert(person);
        }

    }

    @Test
    public void testFindAll() {
        long startTime = new Date().getTime();
        logger.debug("xxxxxxx");
        List<Person> persons = personService.findAll();

        //Assert.assertNotNull(persons);
        long endTime = new Date().getTime();
        long useTime = endTime - startTime;
        logger.debug("xxxxxxx" + JSON.toJSONString(persons));
        logger.debug("Total used " + useTime  + " miliseconds");
    }


    @Test
    public void testFindByPage() {
        Page<Person> persons = personService.findByPage(1, 2);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
        PageInfo<Person> pageInfo = new PageInfo<>(persons);
        Assert.assertNotNull(persons);
        logger.debug(pageInfo.toString());
        logger.debug(JSON.toJSONString(pageInfo));
    }

}

