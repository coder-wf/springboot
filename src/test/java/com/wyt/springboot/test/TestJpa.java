package com.wyt.springboot.test;

import com.wyt.springboot.SpringbootApplication;
import com.wyt.springboot.dao.CategoryDao;
import com.wyt.springboot.pojo.Category;
import org.junit.Before;
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

    @Before
    public void before() {
        List<Category> cs=  dao.findAll();
        for (Category c : cs) {
            dao.delete(c);
        }

        for (int i = 0; i < 10; i++) {
            Category c = new Category();
            c.setName("category " + i);
            dao.save(c);
        }

    }

    @Test
    public void test1() {
        List<Category> cs=  dao.findAll();
        System.out.println("所有的分类信息：");
        for (Category c : cs) {
            System.out.println(c.getName());
        }
        System.out.println();
    }

    @Test
    public void test2() {
        System.out.println("查询名称是 \"category 1 \"的分类:");
        List<Category> cs=  dao.findByName("category 1");
        for (Category c : cs) {
            System.out.println("c.getName():"+ c.getName());
        }
        System.out.println();
    }
    @Test
    public void test3() {
        System.out.println("根据名称模糊查询，id 大于5, 并且名称正排序查询");
        List<Category> cs=  dao.findByNameLikeAndIdGreaterThanOrderByNameAsc("%3%",5);
        for (Category c : cs) {
            System.out.println(c.getId()+":"+c.getName());
        }
        System.out.println();

    }

}
