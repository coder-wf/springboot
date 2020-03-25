package com.wyt.springboot.web;

import com.wyt.springboot.dao.CategoryDao;
import com.wyt.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryDao categoryDao;

    @RequestMapping("/categoryList")
    public String categoryList(Model m){
        List<Category> list = categoryDao.findAll();
        m.addAttribute("list",list);
        return "categoryList";
    }
}
