package com.wyt.springboot.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyt.springboot.dao.CategoryDao;
import com.wyt.springboot.mapper.CategoryMapper;
import com.wyt.springboot.pojo.Category;
import com.wyt.springboot.service.CategoryService;
import com.wyt.springboot.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    /*@Autowired
    CategoryDao categoryDao;

    @RequestMapping("/categoryList")
    public String categoryList(Model m) throws Exception {
        List<Category> list = categoryDao.findAll();
        m.addAttribute("list",list);
        return "categoryList";
    }

    @RequestMapping("/addCategory")
    public String addCategory(Category c) throws Exception {
        categoryDao.save(c);
        return "redirect:listCategory";
    }
    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category c) throws Exception {
        categoryDao.delete(c);
        return "redirect:listCategory";
    }
    @RequestMapping("/updateCategory")
    public String updateCategory(Category c) throws Exception {
        categoryDao.save(c);
        return "redirect:listCategory";
    }
    @RequestMapping("/editCategory")
    public String editCategory(int id,Model m) throws Exception {
        Category c= categoryDao.getOne(id);
        m.addAttribute("c", c);
        return "editCategory";
    }

    @RequestMapping("/listCategory")
    public String listCategory(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page<Category> page =categoryDao.findAll(pageable);
        m.addAttribute("page", page);
        return "listCategory";
    }*/

    /*@Autowired
    CategoryService categoryService;

    @RequestMapping("/listCategory")

    public String listCategory(Model m,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page4Navigator<Category> page =categoryService.list(pageable);
        m.addAttribute("page", page);
        return "listCategory";
    }

    @RequestMapping("/addCategory")
    public String addCategory(Category c) throws Exception {
        categoryService.save(c);
        return "redirect:listCategory";
    }
    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category c) throws Exception {
        categoryService.delete(c.getId());
        return "redirect:listCategory";
    }
    @RequestMapping("/updateCategory")
    public String updateCategory(Category c) throws Exception {
        categoryService.save(c);
        return "redirect:listCategory";
    }
    @RequestMapping("/editCategory")
    public String ediitCategory(int id,Model m) throws Exception {
        Category c= categoryService.get(id);
        m.addAttribute("c", c);
        return "editCategory";
    }*/

    @Autowired(required = false)
    CategoryMapper categoryMapper;

    @RequestMapping("/addCategory")
    public String listCategory(Category c) throws Exception {
        categoryMapper.save(c);
        return "redirect:listCategory";
    }
    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category c) throws Exception {
        categoryMapper.delete(c.getId());
        return "redirect:listCategory";
    }
    @RequestMapping("/updateCategory")
    public String updateCategory(Category c) throws Exception {
        categoryMapper.update(c);
        return "redirect:listCategory";
    }
    @RequestMapping("/editCategory")
    public String listCategory(int id,Model m) throws Exception {
        Category c= categoryMapper.get(id);
        m.addAttribute("c", c);
        return "editCategory";
    }

    @RequestMapping("/listCategory")
    public String listCategory(Model m,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id desc");
        List<Category> cs=categoryMapper.findAll();
        PageInfo<Category> page = new PageInfo<>(cs);
        m.addAttribute("page", page);
        return "listCategory";
    }

}

