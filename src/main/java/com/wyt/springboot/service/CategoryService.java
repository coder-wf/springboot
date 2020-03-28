package com.wyt.springboot.service;

import com.wyt.springboot.pojo.Category;
import com.wyt.springboot.util.Page4Navigator;
import org.springframework.data.domain.Pageable;

public interface CategoryService {

    public Page4Navigator<Category> list(Pageable pageable);

    public void save(Category category);

    public void delete(int id);

    public Category get(int id);
}
