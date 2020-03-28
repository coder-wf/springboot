/*
package com.wyt.springboot.test;

import com.wyt.springboot.SpringbootApplication;
import com.wyt.springboot.dao.CategoryDao;
import com.wyt.springboot.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class TestJpa {
    @Autowired
    CategoryDao dao;

    @Test
    public void test() {
        List<Category> cs=  dao.findAll();
        for (Category c : cs) {
            System.out.println("c.getName():"+ c.getName());
        }
    }

}
*/
