package com.wyt.springboot.mapper;

import com.wyt.springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> findAll();

}
